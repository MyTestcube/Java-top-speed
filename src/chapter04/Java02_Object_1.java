package chapter04;

public class Java02_Object_1 {
    public static void main(String[] args) {
        //todo 面向对象
        //狗：2只，小黑，小白
        Dog dog1=new Dog();
        dog1.color="white";
        dog1.name="小白";
        dog1.run();


        Dog dog2=new Dog();
        dog2.color="black";
        dog2.name="小黑";
        dog2.run();
        //
        //
        //
        //
    }
}

class  Dog{
    String color;
    String name;
    void run(){
        System.out.println(name+"跑开了");
    }
}