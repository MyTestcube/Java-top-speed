package chapter04;

public class Java15_Object {
    public static void main(String[] args) {

        //todo 面向对象
        //方法的重写：父类对象的方法其实主要体现通用性，无法在特殊场合下使用
        //          如果子类对象需要在特殊场合下使用，那么就需要重写方法的逻辑，这操作在Java中称之为方法的重写
        //这里的重写，并不意味着父类的方法被覆盖掉，至少当前的场合不使用。如果使用super关键字还是可以访问
        //方法的重写要求，子类的方法和父类的方法，方法名相同，返回值类型相同，参数列表相同

        Parent15 p=new Parent15();

        Child15 c=new Child15();

        c.test();
    }


}
class Parent15{
    String name="zhangsan";

    void test(){
        System.out.println("parent.test");
//        System.out.println(super.name);
    }
}
class Child15 extends Parent15{

    String  name="lisi";

    void test(){
//        System.out.println(this.name);
//        System.out.println(super.name);
        super.test();
        System.out.println("child.test");

    }
}