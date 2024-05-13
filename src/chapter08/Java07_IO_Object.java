package chapter08;

import java.io.*;

public class Java07_IO_Object {
    public static void main(String[] args) throws Exception {
        //todo IO File Copy-序列号&反序列化

        //todo 数据源文件
        File dateFile = new File("D:\\IntelliJ IDEA Community Edition 2024.1\\idea project\\Java-top-speed\\data\\obj.dat");



        //todo 对象输出流（管道对象）
        ObjectOutputStream objectOut=null;
        FileOutputStream out=null;

        //todo 对象输入流
        ObjectInputStream objectIn=null;
        FileInputStream in=null;
        try {
//            out=new FileOutputStream(dateFile);
//            objectOut=new ObjectOutputStream(out);
            //

            //Java中只有增加了特殊的标记的类，才能再写文件中进行序列化操作
//            User user=new User();
//            objectOut.writeObject(user);
//            objectOut.flush();

            //todo
            in=new FileInputStream(dateFile);
            objectIn=new ObjectInputStream(in);
            Object o = objectIn.readObject();
            System.out.println(o);
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            if (objectOut != null) {
                try {
                    objectOut.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }

        }


    }
}
class User implements Serializable {
    //
}