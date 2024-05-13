package chapter04;

public class Java03_Object {
    public static void main(String[] args) {
        //todo 面向对象
        /*
        基本语法：
            声明
                class 类名{
                    //属性（0个或多个）
                    类型 名称=值
                    //方法（行为，0个或多个）
                    void 方法名（）{
                        逻辑代码
                    }
                 }
             使用
                构建对象：new 类名（）
                访问属性：对象.属性名
                访问方法：对象.方法名（）
         */

        User17 user=new User17();
        System.out.println(user.sex);
    }
}

