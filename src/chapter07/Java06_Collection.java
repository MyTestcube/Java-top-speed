package chapter07;

import java.util.ArrayList;
import java.util.Comparator;

public class Java06_Collection {
    public static void main(String[] args) {
        //todo 集合类
        //
        //

        ArrayList list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("2");

        list.sort(new NumberComparator()); // 排序

        System.out.println(list);
        }
}

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return 1;
        }
        return 0;
    }
}