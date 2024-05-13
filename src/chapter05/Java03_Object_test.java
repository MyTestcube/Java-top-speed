package chapter05;


public class Java03_Object_test {
    public static void main(String[] args) {
        //todo 常见类和对象
        //二维数组
        //
        /*
        九层妖塔
         */

        int row=9;
        int col=2*(row-1)+1;
        String[][] tower=new String[row][col];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if (j>=(row-1)-i && j<=(row-1)+i){
                    tower[i][j]="*";
                }else {
                    tower[i][j]="-";
                }

            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(tower[i][j]);
            }
            System.out.println();
        }


    }
}
