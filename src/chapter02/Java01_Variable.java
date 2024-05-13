package chapter02;

public class Java01_Variable {
    public static void main(String[] args) {

        //TODO 变量
        //1.变量得声明
        //  数据类型    变量名称
        String name;
        //2.变量的赋值
        //  变量名称=数据
        name="zhangsan";
        //3.变量的使用
        //  直接访问变量名称即可
        System.out.println(name);

        //  将变量声明和赋值在一行代码中完成
        String username="lisi";
        System.out.println(username);

        //在使用变量之前必须要给变量赋值，将这个操作称之为变量的初始化
        String email="xxxxxx";
        System.out.println(email);
    }
}
