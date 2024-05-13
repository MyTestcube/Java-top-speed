package chapter05;


public class Java04_Object_String {
    public static void main(String[] args) {
        //todo 常见类和对象
        //冒泡法排序
        int[] arr = {5, 3, 8, 6, 2, 7, 1, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        // 输出排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
}
