package chapter05;


public class Java03_Object_test_3 {
    public static void main(String[] args) {
        //todo 常见类和对象
        //数组-数据查询-二分法

        int[] num={1,2,3,4,5,6,7};
        //查询目标
        int targenum=6;
        int start=0;
        int end=num.length-1;
        int middle=0;
        while (start<=end){
            middle=(start+end)/2;
            if (num[middle] > targenum){
                end=middle-1;
            } else if (num[middle] < targenum) {
                start=middle+1;
            }else break;
        }

        System.out.println("数据位置："+middle+"   targenum："+num[middle]);

    }
}
