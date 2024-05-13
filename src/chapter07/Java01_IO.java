package chapter07;

import java.io.File;
import java.io.IOException;

public class Java01_IO {
    public static void main(String[] args) throws IOException {
        //todo IO

        //文件类型（文件夹、文件）

        String filepath = "D:\\IntelliJ IDEA Community Edition 2024.1\\idea project\\Java-top-speed\\data\\word.txt";
        File file = new File(filepath);
        System.out.println(file);
        //文件对象操作
        System.out.println(file.isFile());
        System.out.println(file.isDirectory ());
        //判断文件是否存在
        System.out.println(file.exists());
        //
        if (file.exists()) {
            System.out.println("文件存在");

            if (file.isFile()) {
                System.out.println("文件");
                System.out.println(file.length());
                System.out.println(file.getName());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsolutePath ());
            } else if (file.isDirectory()) {
                System.out.println("文件夹");

                System.out.println(file.getName());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsolutePath ());
                String[] files = file.list();
                for (String f : files) {
                    System.out.println(f);
                }
            }
        }else {
            System.out.println("文件不存在");
//            file.mkdirs(); //创建多级文件目录
            file.createNewFile(); //创建文件
        }
    }
}
