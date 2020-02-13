import java.io.*;
import java.util.HashMap;

public class ConvertQuestTemplate {

    public boolean ConvertTXT(String input335file, String input548file, String outputfile) throws IOException {

        //BufferedReader是可以按行读取文件
        FileInputStream input335Stream = new FileInputStream(input335file);
        BufferedReader bufferedReader335 = new BufferedReader(new InputStreamReader(input335Stream));
        FileInputStream input548Stream = new FileInputStream(input548file);
        BufferedReader bufferedReader548 = new BufferedReader(new InputStreamReader(input548Stream));

        FileOutputStream outputStream = new FileOutputStream(outputfile);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        String str = null;
        HashMap<String, String> offerreward = new HashMap<String, String>();
        HashMap<String, String> requestitem = new HashMap<String, String>();
        HashMap<String, String> completed = new HashMap<String, String>();
        while((str = bufferedReader335.readLine()) != null)
        {
            str=str.replace("INSERT INTO `quest_template` VALUES (", "");
            String[] datas = str.split(",");
            offerreward.put(datas[0], datas[99]);
            requestitem.put(datas[0], datas[100]);
            completed.put(datas[0], datas[101]);
        }

        while((str = bufferedReader548.readLine()) != null)
        {
            //查找同名npc 335名称并替换
            str=str.replace("INSERT INTO `quest_template` VALUES (", "");
            String[] datas = str.split(",");
            if(offerreward.containsKey(datas[0])) {
                String insertsql1 = "UPDATE `quest_template` SET `OfferRewardText`=" +offerreward.get(datas[0]) + "' WHERE `Id`=" + datas[0] +";";
                String insertsql2 = "UPDATE `quest_template` SET `RequestItemsText`=" +requestitem.get(datas[0]) + "' WHERE `Id`=" + datas[0] +";";
                String insertsql3 = "UPDATE `quest_template` SET `CompletedText`=" +completed.get(datas[0]) + "' WHERE `Id`=" + datas[0] +";";
                insertsql1 = insertsql1.replace("'' WHERE", "' WHERE");
                insertsql2 = insertsql2.replace("'' WHERE", "' WHERE");
                insertsql3 = insertsql3.replace("'' WHERE", "' WHERE");

                System.out.println(insertsql1);
                System.out.println(insertsql2);
                System.out.println(insertsql3);
                //输出文件并换行
                bufferedWriter.write(insertsql1);
                bufferedWriter.newLine();
                bufferedWriter.write(insertsql2);
                bufferedWriter.newLine();
                bufferedWriter.write(insertsql3);
                bufferedWriter.newLine();
            }
        }

        //close
        bufferedReader335.close();
        input335Stream.close();
        bufferedReader548.close();
        input548Stream.close();
        bufferedWriter.close();
        outputStream.close();

        return true;
    }
}
