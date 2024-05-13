package chapter04;

public class Java07_Object_Method_Param {
    public static void main(String[] args) {
        //todo 面向对象-方法-参数
        //使用外部数据控制方法内部实现的操作，使用的是参数语法实现，也叫方法参数
        //语法：方法名（参数类型 参数名称）
        //参数列表
        //语法：方法名（参数类型1 参数名称1，参数类型2 参数名称2）
        User07 user=new User07();
        String name="zansan";
        int age=390;
        user.sayHello(name,age);
        //当方法传递多个参数时，需要注意：
        //1.参数个数需要匹配
        //2.参数类型需要匹配
        //3.参数顺序需要匹配
        //4.当参数的个数不确定，都是类型相同时，可以采用特殊的参数语法声明：可变参数
        //可变参数放最后
        //5.语法：参数类型……参数名称
        user.test(10,"zhangsan","lisi");
    }
}

class User07{
    void sayHello(String name,int age){
        System.out.println("Hello"+name+","+age);//使用参数
    }
    void test(int age,String ...name){
        System.out.println(name);
    }
}
