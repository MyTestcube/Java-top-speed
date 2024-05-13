package chapter02;

public class Java04_Operator_1 {
    public static void main(String[] args) {

        //  todo 运算符-赋值运算;
        //等号其实就是赋值运算符，将等号右边表达式的结果赋值给等号左边的变量
        //赋值运算符需要考虑类型的关系
        String name="zhangsan";
        byte b=10;
        short s=b;

        //todo 复合赋值运算符：+=
        //如果元素进行运算后重新进行赋值给自己，那么可以将运算和赋值的符号进行简化
        int i=1;

        i+=1;//i=i+1;
        i*=2;//i=i*2;
        System.out.println(i);

        //如果使用了复合赋值运算符，那么数据的类型不会发生变化
        byte b1=10;
        b1+=20;
    }
}
