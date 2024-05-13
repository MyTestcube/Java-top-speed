package chapter07;

import java.util.ArrayList;
import java.util.HashSet;

public class Java09_Collection_set {
    public static void main(String[] args) {
        //todo 集合类

        // Set集合

        HashSet set = new HashSet<>();

        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        set.addAll(list); // 集合添加元素

        Object[] array = set.toArray();
        System.out.println(set); // [orange, banana, apple]

        System.out.println(set.isEmpty()); // 判断集合是否为空
        System.out.println(set.size()); // 集合元素个数
        System.out.println(set.contains("banana")); // 判断集合是否包含元素
        set.clear(); // 清空集合

        //删除
//        set.remove("banana");
        //遍历
        for (Object obj : set) {
            System.out.println(obj);
        }



        System.out.println(set); // [orange, banana, apple]

    }
}
