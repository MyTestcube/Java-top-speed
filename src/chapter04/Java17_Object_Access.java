package chapter04;

public class Java17_Object_Access {
    public static void main(String[] args) {

        //todo 面向对象-访问权限
        //public:公共的，访问权限修饰符
        //      java的源码中，公共类只能有一个，而且必须和源码文件名相同
        //main方法：main方法是由jvm调用的，jvm调用时应该可以任意调用，而不用考虑权限问题


        //todo Java中的访问权限主要分为4种：
        //  1.private：私有的，同一个类中可以用
        //  2.(default):默认权限，当不设定任何权限时，jvm会默认提供权限，包(路径）权限
        //  3.protected：受保护的权限，子类可以访问
        //  4.public：公共的，在哪里都可以用
        User17 user=new User17();
        System.out.println(user.username);
        System.out.println(user.sex);
    }


    static void test(){
        System.out.println();
    }


}
class User17{
    private String name;
    public String username;
    String sex;
    protected int age;
    void test(){
        System.out.println(name);
        System.out.println(username);
    }
}