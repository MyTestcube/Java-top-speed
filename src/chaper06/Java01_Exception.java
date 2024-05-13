package chaper06;

public class Java01_Exception {
    public static void main(String[] args) {

        int i = 0;
        int j = 10;


        try {j=j/i;}
        catch (ArithmeticException e) {
            i=10;
            j=j/i;
        }finally {
            System.out.println("最终执行代码");
        }


        System.out.println("j = " + j);
    }
}
