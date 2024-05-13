package chapter04;

public class Java08_Object_Static_2 {
    public static void main(String[] args) {
        //todo 面向对象
        //类的信息加载完成后，会自动调用静态代码块，可以完成静态属性初始化功能
        //对象准备创建时，也会自动调用代码块，但不是静态
        //
//        User08.test();
        new User08();
    }

}

class User08{
    static {
        //静态代码块
        System.out.println("静态代码块执行1");//可以用于静态属性提前初始化
    }
    static {
        //静态代码块
        System.out.println("静态代码块执行2");//可以用于静态属性提前初始化
    }

    static void test(){
        System.out.println("test...");
    }
    {
        System.out.println("代码块执行1");//可以用于静态属性提前初始化

    }
     {
        //静态代码块
        System.out.println("代码块执行2");//可以用于静态属性提前初始化
    }
}