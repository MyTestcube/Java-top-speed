package chapter04;

public class Java14_Object_1 {
    public static void main(String[] args) {

        //todo 面向对象
        //如果在一个构造方法中，想要调用其他的构造方法，就需要使用特殊关键字：this
        //
        //
        //
        //

        User141 u1=new User141();
//        User141 u2=new User141("zhangsan");
//        User141 u3=new User141("lisi","男");
    }

}
class  User141{
    User141(){
        this("zhangsan");
//        System.out.println("无参");
    }

    User141(String name){
        this(name,"nan");
//        System.out.println("一个");
    }

    User141(String name,String sex){
        System.out.println(name+","+sex);
    }

}