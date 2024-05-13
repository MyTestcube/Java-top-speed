package chapter02;

public class Java04_Operator_2 {
    public static void main(String[] args) {

        //  todo 运算符-关系运算符;
        //所谓的关系运算符其实就是用于比较两个数据之间关系的运算符
        //关系运算符的基本语法结构：
        //todo 关系表达式：元素1（数据1、表达式1）   关系运算符（==,！=,>,>=,<,<=）   元素2（数据2、表达式2）
        //关系表达式的结果为布尔类型：如果表达式结果为预想相同，那么结果为true，如果表达式结果和预想不同，那么结果为false
        int i=20;
        int j=10;
        System.out.println(i>j);
        System.out.println(i<j);
        System.out.println(i==j);
        System.out.println(i!=j);
        System.out.println(i>=j);
        System.out.println(i<=j);
    }
}
