package chapter08;

import java.io.*;

public class Java05_IO_File_Copy_String_1 {
    public static void main(String[] args) throws Exception {
        //todo IO File Copy

        //todo 数据源文件
        File sourceFile = new File("D:\\IntelliJ IDEA Community Edition 2024.1\\idea project\\Java-top-speed\\data\\word.txt");
        //todo 数据目的文件对象（自动生成）
        File destFile = new File("D:\\IntelliJ IDEA Community Edition 2024.1\\idea project\\Java-top-speed\\data\\word.txt.copy");

        //todo 字符输入流（管道对象）
        BufferedReader reader=null;
        //todo 字符输出流（管道对象）
        PrintWriter writer=null;

        //todo 缓冲区
        byte[] cache=new byte[1024];
        try {
            reader=new BufferedReader(new FileReader(sourceFile));
            writer=new PrintWriter(new FileWriter(destFile));
            //

            String line=null;

            while ((line=reader.readLine())!= null) {
                System.out.println(line);
                writer.println(line);
            }

//            刷写数据
            writer.flush();
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
            if (writer != null) {
                    writer.close();
            }
        }


    }
}
