package chapter04;

public class Java19_Object {
    public static void main(String[] args) {

        //todo 面向对象-单例模式
        //jvm默认给类提供的构造方法，其实就是公共的，无参的构造方法
        //1.类的创建过程复杂
        //2.类的对象消耗资源
        //
        //
        //
//        User19 user=new User19();
        User19 instance1=User19.getInstance();
        User19 instance2=User19.getInstance();

        System.out.println(instance1.equals(instance2));
    }

}
class User19{

    private static User19  user19=null;
    private User19(){
        ;
    }
    public  static User19 getInstance(){
        if (user19==null){
            user19=new User19();
        }
        return new User19();
    }
}