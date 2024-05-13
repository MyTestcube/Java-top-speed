package chapter04;

public class Java09_Object_Package {
    public static void main(String[] args) {
        //todo 面向对象-package-包
        //package中容纳类
        //基本语法：package 包名(包的完整路径)
        //路径中的多个报用点.隔开
        //java.lang.Object
        //主要功能就是分类管理

        //一个类可以没有包，但是package不可以在同一个源码文件中使用多次
        //包名一般都是小写，以区别类名
        //java.lang.Object

        //java中存在不同包相同名称的类，可以使用包进行区分
        //一般情况下，在使用类的情况下，我们会使用类的全名（包名+类型）
        new java.util.Date();

    }

}

