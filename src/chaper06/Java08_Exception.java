package chaper06;

public class Java08_Exception {
    public static void main(String[] args) {

      //
        String account = "admin";
        String password = "1213";
        try {
            login(account, password);
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void login(String account, String password){
        if (!"admin".equals(account)){
            throw new AccountException("账号错误");
        }
        if (!"admin".equals(password)){
            throw new PasswordException("密码错误");
        }
        System.out.println("登录成功");
    }
}
class AccountException extends LoginException{
    public AccountException(String message){
        super(message);
    }
}
class PasswordException extends LoginException{
    public PasswordException(String message){
        super(message);
    }

}
class LoginException extends RuntimeException{
    //自定义异常类
    public LoginException(String message){
        super(message);
    }
}
class User8{
    public void test(){
        System.out.println();
    }
}