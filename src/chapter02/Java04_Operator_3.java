package chapter02;

public class Java04_Operator_3 {
    public static void main(String[] args) {

        //  todo 运算符-逻辑运算符;
        //所谓的逻辑运算符其实就是用于描述多个条件表达式之间的关系的运算符
        //todo 基本的语法结构：
        //变量=（条件表达式1）逻辑运算符（条件表达式2）
        //结果的变量的类型依然为布尔类型
        //因为条件表达式的结果类型为布尔类型，所以逻辑运算符表达式的结果也是布尔类型，但是分几种情况L:
        //todo 逻辑运算符：&,称之为与运算
        //与运算要求两个条件表达式都必须计算出结果，只有当两个结果都是true时，最终结果为true，其他情况全是false
//        int i=10;
//        boolean result=(i>5)&(i<20);
//        System.out.println(result);

        //todo 逻辑运算符：|,称之为或运算
        //或运算要求两个条件表达式都必须计算出结果，只要任何一个结果是true时，最终结果都是为true，只有两个都是false的情况下为false

//        int i=10;
//        boolean result=(i<5)|(i>20);
//        System.out.println(result);

        //todo 逻辑运算符：&&,称之为短路与运算
        //短路与运算，会根据第一个条件表达式的结果来判断，是否执行第二个条件表达式
        //如果第一个表达式为false，那么就无需执行第二个表达式
//        int i=10;
//        int j=20;
//        boolean result=(i>10)&&(++j>30);
//        System.out.println(result);
//        System.out.println(j);

        //todo 逻辑运算符：||,称之为短路或运算
        //短路或运算，会根据第一个条件表达式的结果来判断，是否执行第二个条件表达式
        //如果第一个表达式为true，那么就无需执行第二个表达式

//        int i=10;
//        int j=20;
//        boolean result=(i==10)||(++j>30);
//        System.out.println(result);
//        System.out.println(j);

        //todo 逻辑运算符：!,称之为非（相反）运算
        int i=10;
        boolean result=i==10;
        boolean result1=i>10;
        System.out.println(!result);
        System.out.println(!result1);

    }
}
