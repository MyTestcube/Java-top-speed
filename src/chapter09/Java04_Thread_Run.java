package chapter09;

public class Java04_Thread_Run {
    public static void main(String[] args) throws Exception {
        //todo 线程-运行
        //
        //
        //
//        MyThread3 myThread3 = new MyThread3();
//        myThread3.start();
//
//        MyThread4 myThread4 = new MyThread4();
//        myThread4.start();

//        MyThread5 myThread5 = new MyThread5();

        //todo 构建线程对象时，可以只把逻辑传递给这个对象
        //传递逻辑时，需要遵循规则：（）->{逻辑}
        Thread t6 = new Thread(()->{
            System.out.println("线程执行1");
        });
        t6.start();

        Thread t7 = new Thread(()->{
            System.out.println("线程执行2");
        });
        t7.start();

        //todo 构建线程对象时，可以传递实现了Runnable接口的对象,一般使用匿名类
        Thread t8 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行3");
            }
        });

//        System.out.println("主线程结束");

    }
}
//todo 自定义线程
//1.继承线程类
//2.重写run()方法
//
class MyThread3 extends Thread {
    //
    @Override
    public void run() {
        System.out.println("t3子线程开始");;
    }
}
class MyThread4 extends Thread {
    //
    @Override
    public void run() {
        System.out.println("t4子线程开始");;
    }
}
class MyThread5 extends Thread {
    //
    private String threadName;
    public MyThread5(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + "线程开始");;
    }
}