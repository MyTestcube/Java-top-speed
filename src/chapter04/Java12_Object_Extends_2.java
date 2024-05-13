package chapter04;

public class Java12_Object_Extends_2 {
    public static void main(String[] args) {

        //todo 面向对象-Extends-继承
        //构造方法
        //父类对象是在子类创建前创建出来的，创建子类对象前，会调用父类对象
        //默认情况下，子类对象构建时，会调用父类的构造方法完成对父类对象的创建，使用super的方式，只不过jvm自动完成
        //如果父类提供构造方法，那么jvm不会提供默认的构造方法，那么子类应该显示调用super方法构建父类对象
        Child2 c1=new Child2();
        Child2 c2=new Child2();
        Child2 c3=new Child2();


        //new:构建一个对象，创建子类对象时，开辟内存空间，里面包含父类的一切属性、方法
    }

}
class Parent2{

    String username;

    Parent2(String name){

        username=name;

        System.out.println("parent");
    };
}
class  Child2 extends Parent2{
//    String username;

    Child2(){

        super("zhansan");

        System.out.println("child");

    };
}