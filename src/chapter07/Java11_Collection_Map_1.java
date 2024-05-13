package chapter07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Java11_Collection_Map_1 {
    public static void main(String[] args) throws Exception {
        //todo 集合类
        //
        HashMap map = new HashMap();
        //
//        map.put("key1", "value0");
//        Object oldVal = map.put("key1", "value1");
//
//        System.out.println("oldVal: " + oldVal);
//
//
//        map.putIfAbsent("key2", "value2");
//        map.putIfAbsent("key2", "value3");
//
//        Object replace = map.replace("key2", "value4");
//        System.out.println("replace: " + replace);
//
//        System.out.println("map: " + map);
//
//        map.clear();
        map.put("zhangsan","1");
        map.put("kisi","2");
        map.put("wanwu","3");

//        Set keySet = map.keySet();
//        for(Object key : keySet){
//            System.out.println(key + ":" + map.get(key));
//        }
//
//        System.out.println(map.containsKey("zhangsan"));

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
