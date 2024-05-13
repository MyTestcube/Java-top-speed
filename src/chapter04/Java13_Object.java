package chapter04;

public class Java13_Object {
    public static void main(String[] args) {

        //todo 面向对象-多态
        //所谓的多态，其实就是一个对象在不同场景下表现出来的不同状态和形态
        //多态语法其实就是对对象的使用场景进行了约束
        //一个对象可以使用的功能取决于引用变量的类型
        //
        //
        Person p=new Person();
        p.testPerson();
        Person p1=new Boy();//子类对象需要成为父类对象时，作为父类对象使用
        p1.testPerson();
//        p1.testBoy();
        Person p2=new Girl();
        p2.testPerson();
//        p2.testGirl();
        Boy b=new Boy();
        b.testBoy();
        Girl g=new Girl();
        g.testGirl();
    }

}
class Person{

    void testPerson(){

        System.out.println("test person");
    };
}
class  Boy extends Person{

    void testBoy(){

        System.out.println("testboy");

    };
}
class  Girl extends Person{

    void testGirl(){

        System.out.println("testgirl");

    };
}