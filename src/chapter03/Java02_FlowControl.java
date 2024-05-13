package chapter03;

public class Java02_FlowControl {
    public static void main(String[] args) {

        // todo 流程控制-分支执行
        //分支机构
        //1.todo 可选分支：单分支结构
        System.out.println("第一步");
        System.out.println("第二步");
        //判断：条件表达式是否为true，如果为true，那么执行分支逻辑，如果为false，继续执行
        //判断的语法使用if关键字，表示如果，在条件表达式前使用
//        int i=120;
//        if (i==10){
//            System.out.println("分支");
//
//        }

        //2.todo 必选分支：双分支结构（二选一）
        //语法上使用if……else操作，这里的else就表示其他的场合
//        int i=10;
//        if (i == 120) {
//            System.out.println("分支1");
//        }else {
//            System.out.println("分支2");
//
//        }
        //3.todo 多分支:多重判断
        //if...else if...else...

        int i=30;
        if (i == 120) {
            System.out.println("分支1");
        } else if (i==20) {
            System.out.println("分支2");

        }
//        else {
//            System.out.println("分支3");
//
//        }
        System.out.println("第三步");
        
        //
    }
}
