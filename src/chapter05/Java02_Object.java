package chapter05;


public class Java02_Object {
    public static void main(String[] args) {
        //todo 常见类和对象
        //数组
        //todo 数组的声明方式：类型【】 变量；
        //todo 数组的创建：new 类型【容量】
        String[] strings=new String[3];
        //给数组的小格子添加数据，添加的方式为：数组变量【索引】=数据
        //添加数据和访问数据时，索引不超过指定范围的（0~length-1）
        //如果重复给相同的索引添加数据，那么等同于修改数据
        //

        User1[] user1=new User1[4];
        for (int i = 0; i < user1.length; i++) {
            user1[i]=new User1();
        }
        for (int i = 0; i < user1.length; i++) {
            user1[i].test();
        }



        strings[0]="zhangsan";
        strings[0]="liu";
        strings[1]="lisi";
        strings[2]="wanwu";
        //查询（访问）数据添加的方式为：数组变量【索引】=数据
//        System.out.println(strings[0]);
        for (int i = 0; i < 3; i++) {
            System.out.println(strings[i]);
        }
    }
}
class User1{
    public void test(){
        System.out.println("test");
    }
}