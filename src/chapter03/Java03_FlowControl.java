package chapter03;

public class Java03_FlowControl {
    public static void main(String[] args) {

        // todo 流程控制-分支执行
        //特殊的分支机构
        //switch(数据){}
        //switch会对数据进行判断，如果等于某一个分支数据的值，那么执行对应分支的逻辑代码
        //如果一个分支都无法匹配，那么一个分支都不会执行，如果需要无法匹配也需要执行分支，那么可以增加default关键字
        //如果执行某个分支后，不想执行其他分支，那么可以使用break关键字，跳出分支机构
        System.out.println("第一步");
        System.out.println("第二步");

        int i=50;
        switch (i){
            case 10:
                System.out.println("分支1");
                break;
            case 20:
                System.out.println("分支2");
                break;

            case 30:
                System.out.println("分支3");
                break;

            case 40:
                System.out.println("分支4");
                break;

            case 50:
                System.out.println("分支5");
                break;

            default:
                System.out.println("分支6");
                break;


        }
        System.out.println("第三步");
        
        //
    }
}
