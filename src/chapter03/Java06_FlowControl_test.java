package chapter03;

public class Java06_FlowControl_test {
    public static void main(String[] args) {

        // todo 流程控制-练习
        //九层妖塔
        /*
          *
         * *
        * * *
       * * * *
         */
        //打印第一层数据
//        for (int i = 0; i < 1; i++) {
//            System.out.print("*");
//        }
//        System.out.println("");

        //println方法打印字符之后会自动换行
        //print方法打印字符后，不换行
//        for (int i = 0; i < 3; i++) {
//            System.out.print("*");
//        }
//        System.out.println("");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//        }
//        System.out.println("");
//
//        for (int i = 0; i < 7; i++) {
//            System.out.print("*");
//        }
//        System.out.println("");
        int level=7;
        for (int j = 0; j < level; j++) {
            for (int i = 0; i < level-1-j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j*2+1; i++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
