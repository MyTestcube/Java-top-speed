
package chapter04;

public class Java24_Object {
    public static void main(String[] args) {

        //todo 面向对象
        //在某些场合下，类的名字不重要，我们只需要调用类中的方法或功能，那么此时我们可以采用特殊的语法：匿名类
        //所谓的匿名类就是没有名字的类
        //
        //

        Me me=new Me();
        me.sayHello(new zhangsan());
        me.sayHello(new Lisi());
        me.sayHello(new Person24() {
            @Override
            public String name() {
                return "玩五";
            }
        });

        new Bird24().fly();
        new Fly(){
            public void fly(){
                System.out.println("人类用飞机飞行");
            }

        }.fly();
    }

}

interface Fly {
    public void fly();
}
class Bird24 implements Fly{
    public void fly(){
        System.out.println("鸟用翅膀飞翔");
    }

}

abstract class Person24{

    public abstract String name();
}
class Me{
    public void sayHello(Person24 person24){
        System.out.println("hello,"+person24.name());
    }
}
class zhangsan extends Person24{
    public  String name(){
        return "zhangsan";
    }

}
class Lisi extends Person24{
    public  String name(){
        return "lsi";
    }

}