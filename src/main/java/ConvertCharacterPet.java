import TC335.characters;

import java.io.*;

public class ConvertCharacterPet {

    public boolean ConvertTXT(String inputfile, String outputfile) throws IOException {

        //BufferedReader是可以按行读取文件
        FileInputStream inputStream = new FileInputStream(inputfile);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        FileOutputStream outputStream = new FileOutputStream(outputfile);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        String str = null;
        while((str = bufferedReader.readLine()) != null)
        {
            System.out.println(str);

            //逐行读取inputfile，去掉前后括号，拆开逗号分隔,转成335类型对象
            str = str.replace("(", "");
            str = str.replace(")", "");
            TC335.character_pet oldpet = new TC335.character_pet(str.split(","));

            //通过548方法打印成带括号的value串
            String insertsql = MYWOW1_3_4.character_pet.convertToSql(oldpet);
            //输出文件并换行
            bufferedWriter.write(insertsql);
            bufferedWriter.newLine();
        }

        //close
        bufferedReader.close();
        inputStream.close();
        bufferedWriter.close();
        outputStream.close();

        return true;
    }
}
