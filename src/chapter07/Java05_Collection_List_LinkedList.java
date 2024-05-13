package chapter07;

import java.util.LinkedList;

public class Java05_Collection_List_LinkedList {
    public static void main(String[] args) {
        //todo 集合-collection
        //LinkList
        LinkedList list = new LinkedList();

        //增加数据
        list.add("apple");
        list.add("banana");
        list.add("orange");

        //指定位置增加
        list.add(1,"grape");

        list.addFirst("pear");
        list.addLast("watermelon");

//        list.removeFirst();
//        list.removeLast();

//        System.out.println(list.element());
//        System.out.println(list.indexOf("banana"));

        list.push("strawberry");//将数据添加到第一个

        list.offer("peach");//将数据添加到最后一个

//        list.pop(); //删除第一个数据
        list.poll(); //删除最后一个数据

        System.out.println(list);
        //todo 获取数据
//        System.out.println(list.getFirst());
//        System.out.println(list.get(1));
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("for循环获取数据" + list.get(i));
//        }
//        for (Object o : list) {
//
//            System.out.println("Object 集合数据：" +o);
//        }
        //更改数据
//        System.out.println("更改前数据：" + list.set(1,"grape"));

        //删除数据
//        System.out.println("删除前数据：" + list.remove(1));
//        System.out.println("删除前数据：" + list.remove("grape"));

        //打印集合数据
//        System.out.println( list);
    }
}
