package chapter04;

public class Java18_Object {
    public static void main(String[] args) {

        //todo 面向对象
        //Java不允许外部类使用private修饰
        //所谓外部类，就是在源码中直接声明的类
        //所谓的内部类，就是在类里声明的类
        //内部类就当成外部类的属性使用即可
        //因为内部类可以看做外部类的属性，使用需要构建外部类对象才能使用

        OuterClass outer=new OuterClass();
        OuterClass.InnerClass innerClass = outer.new InnerClass();
    }

}
class OuterClass{
    public class InnerClass{
        ;
    }
}