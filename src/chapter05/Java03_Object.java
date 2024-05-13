package chapter05;


public class Java03_Object {
    public static void main(String[] args) {
        //todo 常见类和对象
        //数组
        //
        //
        //
//        String[] nums=new String[3];
//
//        for (String num : nums) {
//            System.out.println(num);
//        }
//        String[] name={"a","b","c"};
//        for (String s : name) {
//            System.out.println(s);
//        }
//        System.out.println(name.length);
        //二维数组
        String[][] name={{"a","b","c"},{"d","e"}};
        int[][] s=new int[3][3];

        for (int row = 0; row < 3; row++) {//行
            for (int col = 0; col < 3; col++) {//列
                s[row][col]= row + col;
                System.out.print(s[row][col]+"   ");
            }
            System.out.println();
        }
    }
}
