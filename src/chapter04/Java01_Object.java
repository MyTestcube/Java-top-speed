package chapter04;

public class Java01_Object {
    public static void main(String[] args) {
        //todo 面向对象
        //所谓的面向对象，其实就是分析问题时，以问题所涉及的事和物为中心的分析方式
        //类和对象
        //类表示归纳和整理
        //对象就表示具体的事物
        //todo class(类)
        /*
            基本语法结构：

            class 类名（第一个字母习惯用大写）{
                特征（属性）
                功能（方法）
            }
            创建对象的语法：
            new 类名（）；
         */
        //问题：做一道菜，红烧排骨
        //类：菜，对象：红烧排骨

        //todo 1.先声明类
        //todo 2.创建对象
        //todo 3.声明属性，所谓的属性其实就是类中的变量
        //  变量类型 变量名称=变量值
        //  属性类型 属性名称=属性值
        //todo 4.声明方法
        //      void 方法名（参数）{功能代码}
        //todo 5.执行方法
        //      对象. 属性
        //      对象. 方法名（）

        //引用数据类型
        Cooking c=new Cooking();
        c.name="红烧排骨";
        c.food="排骨";
        c.execute();

        Cooking c1=new Cooking();
        c1.name="红烧鱼";
        c1.food="鲫鱼";
        c1.execute();
    }
}
class  Cooking{

    //特征（属性）
    //名字
    String name;
    //菜的类型
    String type="红烧";
    //食材
    String food;
    //佐料
    String  relish="大料";
    //

    void execute(){
        System.out.println("准备食材:"+food);
        System.out.println("准备佐料:"+relish);
        System.out.println("开始烹饪");
        System.out.println(name+"烹饪完成");
    }
}