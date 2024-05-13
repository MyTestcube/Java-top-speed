package chapter02;

public class Java02_Identifier {
    public static void main(String[] args) {

        //TODO 标识符
        //标识数据的符号，称之为标识符
        //变量名称就是标识符
        //标识符主要用于取名
        String name="zhangsan";

        //TODO 标识符 的命名规则
        //1.英文拉丁字母
        String username="zhangsan";
        String xingming="lisi";
        //@,#,%,$
        //标识符只能采用下划线和美元$符号，其他符号不能使用，称之为特殊符号
        //空格属于特殊符号，所以也不能作为标识符使用
        String _name="wangwu";
        String $name="wangwu";
        String $na_me="wangwu";
        System.out.println(_name);
        System.out.println(name);
        System.out.println($name);
        System.out.println($na_me);
        //3.数字
        //阿拉伯数字0到9可以作为标识符使用
        //数字如果在标识符开头位置，那么会被识别为数字，而不是标识符，所以会发生错误
        // String 1name="zhangsan";
        String name1="zhangsan";


        //4.在大括号范围内，标识符不允许重复
        //String name="zhangsan";

        //标识符是区分大小写
        String Name="zhangsan";
        //5.java语言中预先定义好了一些标识符名称，称之为关键字或保留字
        //可以使用大小写来实现关键字名称定义，但是容易造成歧义，所以不建议
        String Static="zhangsan";

        //6.驼峰标识：规范
        String userName="zhangsan";

        //7.标识符没有长度限制

    }
}
