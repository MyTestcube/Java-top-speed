package chapter02;

public class Java04_Operator {
    public static void main(String[] args) {

        //  todo 运算符;
        //  所谓的运算符就是差与数据运算的符号，java定义的 ，无法自行定义


        //TODO 表达式
        //所谓的表达式就是采用运算符和数据连接在一起形成符合Java语法规则的指令代码，称之为表达式

        //TODO 算术运算符
        //1.二元运算符：两个元素差与运算的运算符，如1+2
        //todo  算术表达式=元素1 +二元运算符+元素2
        //这个表达式是有结果的，就需要有类型，这里的类型是元素中类型最大的那一种,最小使用的类型为int类型
//        System.out.println(1+2);
//        System.out.println(5-2);
//        System.out.println(2*2);
//        System.out.println(1.0/2);
//        System.out.println(5%2);//取余5/2余1

        byte b1=10;
        byte b2=20;
        byte b3=(byte)(b2+b1);//因为最小使用的类型为int类型，计算是b2+b1自动转换为int，所以需要加（byte）强行转化为byte

        System.out.println(1+2*3);
        System.out.println((1+2)*3);
        //2.一元运算符：一个元素差与运算的运算符
        //++,--
        //
//        int i=0;
//        int j=i;
//        i=i+1;
//        int j=i++;
//        j=++i;
//        System.out.println("i="+i);
//        System.out.println("j="+j);

        int i=1;
        int j=i;

    }
}
