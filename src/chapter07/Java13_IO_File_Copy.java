package chapter07;

import java.io.*;

public class Java13_IO_File_Copy {
    public static void main(String[] args) throws Exception {
        //todo IO File Copy

        //todo 数据源文件
        File sourceFile = new File("D:\\IntelliJ IDEA Community Edition 2024.1\\idea project\\Java-top-speed\\data\\word.txt");
        //todo 数据目的文件对象（自动生成）
        File destFile = new File("D:\\IntelliJ IDEA Community Edition 2024.1\\idea project\\Java-top-speed\\data\\word.txt.copy");
        //todo 文件输入流（管道对象）
        FileInputStream in=null;
        //todo 文件输出流（管道对象）
        FileOutputStream out=null;
        try {
            in=new FileInputStream(sourceFile);
            out=new FileOutputStream(destFile);
            //
            int data ;
            while ((data=in.read())!= -1) {
                out.write(data);
            }
//            out.write(data);
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            if (in != null) {
                try {
                    in.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
