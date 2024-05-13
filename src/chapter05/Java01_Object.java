package chapter05;


public class Java01_Object {
    public static void main(String[] args) {
        //todo 常见类和对象
        //java.lang.Object:对象
        //
        Object o=new Person();
        Object o1=new User();
        //将对象转换为字符串
        //toString默认打印的就是对象的内存地址，所以，为了能够更直观的理解对象的内容，可以重写这个方法
        String string = o.toString();
        System.out.println(string);
        //todo 获取对象的内存地址
        //
        int i = o.hashCode();
        System.out.println(i);

        //todo 判断两个对象是否相等，如果相等，那么返回true，否则返回false
        //equals方法比较对象时，默认是比较内存地址
        Person otherperson=new Person();
        System.out.println(otherperson.hashCode());
        System.out.println(o.equals(new Person()));
        //getclass获取对象的类型信息
        Class<?>aClass=o.getClass();
        System.out.println(aClass.getPackageName());
    }
}
class Person{
    public String name="zhangsan";
//    @Override
//    public String toString() {
//        return "person["+name+"]";
//    }


}
//class User extends Person{
//    ;
//}