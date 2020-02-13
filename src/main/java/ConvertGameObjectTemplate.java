import java.io.*;
import java.util.HashMap;

public class ConvertGameObjectTemplate {

    public boolean ConvertTXT(String input335file, String input548file, String outputfile) throws IOException {

        //BufferedReader是可以按行读取文件
        FileInputStream input335Stream = new FileInputStream(input335file);
        BufferedReader bufferedReader335 = new BufferedReader(new InputStreamReader(input335Stream));
        FileInputStream input548Stream = new FileInputStream(input548file);
        BufferedReader bufferedReader548 = new BufferedReader(new InputStreamReader(input548Stream));

        FileOutputStream outputStream = new FileOutputStream(outputfile);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        String str = null;
        HashMap<String, String> names = new HashMap<String, String>();
        while((str = bufferedReader335.readLine()) != null)
        {
            str=str.replace("INSERT INTO `gameobject_template` VALUES (", "");
            String[] datas = str.split(",");
            names.put(datas[0], datas[3]);
            System.out.println(datas[0]+","+datas[3]);
        }

        while((str = bufferedReader548.readLine()) != null)
        {
            //查找同名npc 335名称并替换
            str=str.replace("INSERT INTO `gameobject_template` VALUES (", "");
            String[] datas = str.split(",");
            if(names.containsKey(datas[0])) {
                String insertsql = "UPDATE `gameobject_template` SET `name`=" +names.get(datas[0]) + "' WHERE `entry`=" + datas[0] +";";
                insertsql = insertsql.replace("'' WHERE", "' WHERE");
                System.out.println(insertsql);
                //输出文件并换行
                bufferedWriter.write(insertsql);
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
