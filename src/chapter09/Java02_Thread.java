package chapter09;

public class Java02_Thread {
    public static void main(String[] args) throws Exception {
        //todo 线程-执行方式（串行，并行，异步）
        //串行执行：多个线程连接在一起，一个接着一个地执行
        //并发执行：多个线程同时执行
        //
        //
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        //
        t1.join();
        t2.join();

        System.out.println("over");

    }
}
//todo 第一个线程
class MyThread1 extends Thread {
    //重新运行指令
    public void run() {
        System.out.println("my thread-1 name: " + Thread.currentThread().getName());
    }
    //
}
class MyThread2 extends Thread {
    //重新运行指令
    public void run() {
        System.out.println("my thread-2 name: " + Thread.currentThread().getName());
    }
    //
}