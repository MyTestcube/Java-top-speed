package chapter04;

public class Java12_Object_Extends_1 {
    public static void main(String[] args) {

        //todo 面向对象-Extends-继承
        //如果父类和子类含有相同的属性，可以采用特殊的关键字区分
        Child1 child1=new Child1();
        System.out.println(child1.name);
        child1.test();
    }

}
class Parent1{
    String  name="zahnsan";
}
class Child1 extends Parent1{
    String name="lisi";
    void test(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
}