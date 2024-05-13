package chapter05;


public class Java03_Object_test_1 {
    public static void main(String[] args) {
        //todo 常见类和对象
        //二维数组
        //
        int[] nums={1,4,5,2,3  };

//        for (int num : nums) {
//            System.out.println(num);
//        }
        //todo 希望收获到的数据：1，2，3，4，5
        //简化需求：选出最大值
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j<nums.length; j++) {
                int num1=nums[i];
                int num2=nums[j];
                if (num1>num2){
                    nums[i]=num2;
                    nums[j]=num1;

                }
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
