package chapter07;

import java.util.Arrays;

public class Java12_Collection_Util {
    public static void main(String[] args) throws Exception {
        //todo 集合类
        //

        int[] is = {1,6,7, 9, 3, 8, 2, 4, 5};

        int[] is2 = {1,6,7, 9, 3, 8, 2, 4, 5};

        //todo 排序
        Arrays.sort(is);

        System.out.println(Arrays.binarySearch(is, 6));
        System.out.println(Arrays.toString(is));

        System.out.println(Arrays.equals(is, 0, 5, is2, 0, 5));
    }
}
