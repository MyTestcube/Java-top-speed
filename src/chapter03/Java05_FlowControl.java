package chapter03;

public class Java05_FlowControl {
    public static void main(String[] args) {

        // todo 流程控制-重复执行（循环）
        //根据条件重复循环某段代码
        //java中主要用于循环的语法有3个：
        //1.while:有条件循环
        //while（条件表达式）{需要循环的代码}
        //基本执行原理：while循环会判断条件表达式的结果是否为true
        //如果为false，跳出循环
        //如果为true，会执行大括号内的逻辑代码，代码执行完毕后，会重新对条件表达式进行判断
        int age=30;
//        while (age<40){
//            System.out.println("循环的代");
//            age++;
//        }//先判断再执行
        //2.do...while
        //while循环语法可能执行，也可能不执行
        //while循环语法中的循环代码至少执行一次
        /*
            基本语法结构：
            do{
            循环的代码
            }while(条件表达式)
         */

//        do {
//            System.out.println("循环的代码");
//        }while (age<40);//先执行再判断
        //3.for
        //如果条件表达式不出来即为false，那么跳过循环语句，直接执行后续代码，如果返回结果为true，那么执行循环代码
        //初始化表达式用于对条件表达式中用到的变量进行初始化
        /*
            for(初始化表达式;条件表达式;更新表达式){
                循环代码
            }
         */
        for (; age <40 ; age++) {
            System.out.println("循环的代码");
        }
        System.out.println("over");
    }
}
