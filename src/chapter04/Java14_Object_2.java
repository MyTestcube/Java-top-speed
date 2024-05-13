package chapter04;

public class Java14_Object_2 {
    public static void main(String[] args) {

        //todo 面向对象
        //
        //
        //
        byte b=10;
        //byte=>8
        //short=>16
        //char=>16
        //int=>32
        //基本数据类型在匹配方法时，可以子啊数字不必的情况下，扩大数据的精度
        //byte类型无法和char类型做转换，char没有负数，但是byte存在负数
        //
        //
        test(b);
    }

//    static void test(byte b){
//        System.out.println("bbb");
//    }

//    static void test(short s){
//        System.out.println("sss");
//    }

    static void test(char c){
        System.out.println("ccc");
    }

    static void test(int i){
        System.out.println("iii");
    }
}
