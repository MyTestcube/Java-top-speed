package chapter07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java13_IO_File_Copy_Buffer {
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

        //todo 缓冲输入流（管道对象）
        FileInputStream inBuffer=null;
        //todo 缓冲输出流（管道对象）
        FileOutputStream outBuffer=null;

        //todo 缓冲区
        byte[] cache=new byte[1024];
        try {
            in=new FileInputStream(sourceFile);
            out=new FileOutputStream(destFile);

            inBuffer=new FileInputStream(sourceFile);
            outBuffer=new FileOutputStream(destFile);
            //
            int data ;
            while ((data=inBuffer.read())!= -1) {
                outBuffer.write(cache,0,data);
            }
//            out.write(data);
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            if (inBuffer != null) {
                try {
                    inBuffer.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
            if (outBuffer != null) {
                try {
                    outBuffer.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
