package chapter04;

public class Java20_Object {
    public static void main(String[] args) {

        //todo 面向对象-单例模式
        //java中提供了一种语法，可以在数据初始化后不被修改，使用关键字final
        //final可以修饰变量：变量的值一旦被初始化后无法修改
        //final可以修饰属性：那么jvm无法自动进行初始化，
        //一般将final修饰的变量称之为常量或者叫不可变变量
        //final可以修饰方法，这个方法不能被子类重写
        //final可以修饰类，这样类就没有子类了
        //final不能修饰构造方法
        //


        final String name="zhangsan";

        System.out.println(name);

//        User20 user=new User20("wangwu");
        User20 user=new User20();
//        user.name="zhangsan";
//        System.out.println(user.name);

//        user.name="lisi";
//        System.out.println(user.name);
    }

}
final class  User20{

    public User20(){
        ;
    }

    public void test(final String name){
//        name="a";
    }
//    public final User20(){
//
//    }
//    public final String name;
//    public User20(String name){
//        this.name=name;
//    }
//    public final void test(){
//        ;
//    }
}
//class Child20 extends User20{
//    public void test();
//}