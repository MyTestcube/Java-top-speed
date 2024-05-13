package chapter04;

public class Java23_Object_Enum {
    public static void main(String[] args) {

        //todo 面向对象-枚举
        //枚举是一种特殊的类，其中包含了一组特定的对象，这些对象不会发生改变，一般都使用大写的标识符，
        //枚举使用Enum关键字使用
        //枚举类会将对象放在最前面，那么和后面的语法需要使用符号隔开
        //
        //
        //
        System.out.println(City.BEIJING.name);
        System.out.println(City.SHANGHAI.code);
    }

}

enum City{
    BEIJING("北京",1001),SHANGHAI("上海",1002);

    City(String name,int code){
        this.code=code;
        this.name=name;
    }

    public String name;

    public int code;
}