
package chapter04;

public class Java26_Object {
    public static void main(String[] args) {

        //todo 面向对象-作用域
        //
        //

        //
        User26 user26=new User26();
        System.out.println(user26.name);
        user26.test();
        user26.father();
    }


}
class Person26{
    public static String name="zhagnsan";
}
class User26 extends Person26{
    public static String name="lisi";
    public void test(){
        String name="wangwu";
        //当属性和局部变量名称相同是，优先调用变量；
        System.out.println(name);
    }
    public static void father(){

        System.out.println(Person26.name);
    }
}