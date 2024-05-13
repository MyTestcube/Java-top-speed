package chapter03;

public class Java05_FlowControl_1 {
    public static void main(String[] args) {

        // todo 流程控制-重复执行（循环）
//        for (int i = 0; i < 10; i++) {
//            if (i==4) {
//                //留空，跳过4
//            }else System.out.println(i);
//
//        }
        for (int i = 0; i < 10; i++) {
            if (i==4) {
//                break;//切断，跳出循环
                continue;//跳过当前循环，执行下一次循环
            }
            System.out.println(i);
        }
    }
}
