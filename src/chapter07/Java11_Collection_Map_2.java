package chapter07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Java11_Collection_Map_2 {
    public static void main(String[] args) throws Exception {
        //todo 集合类
        //
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        //取得map的key集合
        Set<String> keys = map.keySet();

        //
        Iterator<String> iterator = keys.iterator();

        //
        while (iterator.hasNext()) {
            String key = iterator.next();
            if ("banana".equals(key)) {
                iterator.remove();
            }
            System.out.println(map.get(key));
        }

    }
}
