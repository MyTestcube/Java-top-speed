package chapter09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java05_Thread_Pool {
    public static void main(String[] args) throws Exception {
        //todo 线程-线程池对象
        //所谓的线程池，其实就是线程对象的容器
        //可以根据需要，在启动时，创建一个或多个线程对象
        //Java有4中比较常见的线程池
        //1.创建固定数量的线程对象
        //  ExecutorService是线程对象
//        ExecutorService executor = Executors.newFixedThreadPool(3);
        //2.根据需求动态创建线程对象
//          ExecutorService executor = Executors.newCachedThreadPool();
        //3.创建单线程对象
//          ExecutorService executor = Executors.newSingleThreadExecutor();
        //4.定时调度线程
          ExecutorService executor = Executors.newScheduledThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }



    }
}
