package chaper06;

public class Java03_Exception {
    public static void main(String[] args) {
        User3 user = null;

        try {
            System.out.println(user.toString());
        }catch (NullPointerException e) {

            System.out.println("对象为空 ");
        }
    }
}
class User3 {
    ;
}