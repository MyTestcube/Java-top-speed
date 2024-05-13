package chapter07;

import java.util.concurrent.ArrayBlockingQueue;

public class Java10_Collection_Queue {
    public static void main(String[] args) throws InterruptedException {
        //todo 集合类

        //ArrayBlockingQueue : Array+Blocking(阻塞，堵住)+Queue(队列)
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        //add方法如果增加数据增加不了，直接发生错误。
//        queue.add("a");
//        queue.add("b");
//        queue.add("c");
//        queue.add("d");

//        queue.put("a");
//        queue.put("a");
//        queue.put("a");
//        queue.put("a");

        boolean a = queue.offer("a");
        System.out.println(a);
        boolean b = queue.offer("b");
        System.out.println(b);
        boolean c = queue.offer("c");
        System.out.println(c);
        boolean d = queue.offer("d");
        System.out.println(d);

//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());

        System.out.println(queue.take());
        System.out.println(queue.take());    //阻塞，堵住
        System.out.println(queue.take());

        System.out.println(queue);
    }
}
