package chapter04;

public class Java08_Object_Static {
    public static void main(String[] args) {
        //todo 面向对象
        //针对于具体对象的属性称之为对象属性，成员属性，实例属性
        //针对于具体对象的属性称之为对象方法，成员方法，实例方法
        //把和对象无关，只和类相关的称之为静态
        //把和类相关的属性、方法称之为静态属性、静态方法
        //静态语法就是在属性和语法前增加static关键字
//        Chinese c=new Chinese();
//        c.name="zhangsan";
//
//        System.out.println("hello "+c.name+"，"+c.nationality);
        Bird.fly();
        System.out.println(Bird.type);
    }
}

class Bird{
    static String type="鸟";
    static void fly(){
        System.out.println("fly");
    }
}
class Chinese{
    String name;
    int age;

    String nationality ="中国";
}