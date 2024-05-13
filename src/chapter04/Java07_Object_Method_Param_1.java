package chapter04;

public class Java07_Object_Method_Param_1 {
    public static void main(String[] args) {
        //todo 面向对象-方法-参数
        //java中方法参数的传递方式为值传递
        //基本数据类型：数值
        //引用数据类型：引用地址
        //
//        String s="abc";
//        int j=test(i);
//        System.out.println(s);
        User user=new User();
        user.name="zhangsan";
        user.age=10;
        test(user);
        System.out.println(user.name+user.age);
        //
    }
    public static void test(User user) {
        user.name="lisi";
        user.age=20;
//        return i;
    }
}

class User{
    String name;
    int age;
}