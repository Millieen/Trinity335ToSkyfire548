import obj.SF548Characters;
import obj.TC335Characters;

import java.io.*;

public class ConvertCharacters {

    public boolean ConvertCharactersTXT(String inputfile, String outputfile) throws IOException {

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
            str = str.replace("INSERT INTO `creature_template` VALUES (", "");
            str = str.replace(");", "");
            TC335Characters oldcharacter = new TC335Characters(str.split(","));

            //使用548方法从335转成548对象
            SF548Characters newcharacter = SF548Characters.convert(oldcharacter);

            //通过548方法打印成带括号的value串
            String insertsql = newcharacter.to_sql();
            //输出文件并换行
            bufferedWriter.write(insertsql);
            bufferedWriter.newLine();
        }

        //close
        inputStream.close();
        bufferedReader.close();
        outputStream.close();
        bufferedWriter.close();

        return true;
    }
}
