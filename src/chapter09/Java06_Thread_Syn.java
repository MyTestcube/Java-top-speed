package chapter09;

public class Java06_Thread_Syn {
    public static void main(String[] args) throws Exception {
        //todo 线程-同步
        //synchronized - 同步关键字
        //多个线程访问方法时，只能一个一个访问，同步操作
        //new HashTable<>()
        //synchronized关键字还可以修饰代码块，称之为同步代码块
        /*
           synchronized(用于同步对象){
           处理逻辑
           }
         */
        Num num = new Num();

        User user1 = new User(num);
        user1.start();

        Bank bank = new Bank(num);
        bank.start();
    }
}
class Num{
    //
}
class  Bank extends Thread {
    private Num num ;
    public Bank(Num num) {
        this.num = num;
    }
    public void run() {
        synchronized (num){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("银行开门了，叫好开始");
            num.notifyAll();
        }
    }
}
class User extends Thread {
//    public synchronized void test(){
//        //
//    }
    private Num num ;
    public User(Num num) {
        this.num = num;
    }
    public void run(){
        synchronized (num){
            System.out.println("我是号码1，银行没开门，需要等一会");
            try {
                num.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("叫到号了，开始办业务");
        }
    }
}