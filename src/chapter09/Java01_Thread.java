package chapter09;

public class Java01_Thread {
    public static void main(String[] args) {
        //todo 线程
        //Thread 是线程类
        //currentThread 方法用于获取当前正在运行的线程对象
        //getName 方法用于获取线程的名称
        //main方法运行在main线程中
        System.out.println(Thread.currentThread().getName());

        //todo 创建线程
//        Thread t = new Thread();
        MyThread mt = new MyThread();
        //todo启动线程
        mt.start();
        //
        //
    }
}
//todo 声明自定义线程类
class MyThread extends Thread {
    //重新运行指令
    public void run() {
        System.out.println("my thread name: " + Thread.currentThread().getName());
    }
    //
}