package chapter04;

public class Java15_Object_1 {
    public static void main(String[] args) {

        //todo 面向对象-重写
        //
        //
        //
        //
//        CCC ccc=new CCC();
//        System.out.println(ccc.sum());

        //一个对象能使用什么方法，取决于引用变量的类型
        //一个对象能使用什么属性，取决于引用变量的类型
        //一个对象的方法的具体使用（直接或间接）是需要看具体对象的
        //一个对象的属性的具体使用是不需要看具体对象的，属性在哪里声明在哪里使用
        CCC ddd=new DDD();
        System.out.println(ddd.sum());
    }


}
class CCC{
    int i=10;

    int sum(){
        return getI()+10;
    }
    int getI(){
        return i;
    }
}
class DDD extends CCC{
    int i=20;

//    int sum(){
//        return i+20;
//    }
    int getI(){
        return i;
    }
}