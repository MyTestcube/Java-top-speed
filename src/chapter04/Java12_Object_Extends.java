package chapter04;

public class Java12_Object_Extends {
    public static void main(String[] args) {

        //todo 面向对象-Extends-继承
        //面向对象编程中有3个非常重要的特征：继承，封装，多态
        //类存在父子关系可以直接获取到父类的成员属性和成员方法。
        //类的继承只能说单继承，一个类只能有一个父类，不能存在多个父类
        //一个父类可以有多个子类
        //
        //

        Child c=new Child();
        System.out.println(c.name);
        c.test();
    }

}
class Parent{
    String name="zhansan";
    void test(){
        System.out.println("test");
    }
}
class Child extends Parent{
    ;
}