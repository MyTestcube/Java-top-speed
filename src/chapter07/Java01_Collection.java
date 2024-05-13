package chapter07;

import java.util.ArrayList;

public class Java01_Collection {
    public static void main(String[] args) {
        //todo 集合类

        //java中集合是一个名词，数据的一种容器，用于容纳数据
        //Java提供了完整的集合框架
        //todo 提问：什么时候需要一个容纳数据的容器，也就是集合对象？
        //       java集合框架中就包含了对不确定个数的数据处理的集合
        //todo 问题：如果只是为了容纳数据，可以是直接使用数组，为什么要学习集合？
        //       数组使用起来不方便。在数据个数不确定的场合，数组使用起来不是很方便
        //todo 总结：对不确定的有关系的数据进行相同的逻辑处理的场合，使用集合是一个不错的选择
        //1.单一数据体系：Collection接口定义了相关的规则
        //  List接口：元素有序，可重复，元素可以为空
        //      具体的实现类有ArrayList、LinkedList、Vector
        ArrayList list = new ArrayList();
        //1.不需要传递构造参数，直接new就可以，底层数组为空数组
        //2.构造参数需要传递一个int类型的值，用于设定底层数组长度
        //3.构造参数需要传递一个Collection类型的值，用于将集合中的元素添加到新创建的集合中
        //todo 增加数据
        list.add("hello");
        list.add("world");
        //todo 遍历集合
        System.out.println(list.size());
        //获取指定位置的数据
        System.out.println(list.get(1));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Object o : list) {
            System.out.println(o);
        }
        //todo 修改数据
        //将指定位置数据修改,set方法需要传递两个参数，第一个参数是索引，第二个参数是值
        //返回值是修改前的值
        Object obj = list.set(1, "java");
        System.out.println(obj);//obj是修改前的值
        //todo 删除数据
        //remove方法需要传递一个参数，是索引
        //返回值是删除的值
        obj = list.remove(1);
        System.out.println(obj);//obj是删除的值

        //增加数据
        list.add(0, "java");
        list.add(2, "world");

        ArrayList list2 = new ArrayList();
        list2.add("123");
        list2.add("567");
        list2.add("java");
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

        //获取指定数据所在的索引
        //如果数据不存在，返回-1
        System.out.println(list.indexOf("java"));
        System.out.println(list.lastIndexOf("java"));
        System.out.println(list.indexOf("666"));

        Object[] arr = list.toArray();
        Object clone=list.clone();
        ArrayList list3=(ArrayList)clone;
        System.out.println(list3);
        //删除指定集合

        list.removeAll(list2);
        //todo 打印集合对象
        System.out.println(list);

        //清空集合
        System.out.println(list.isEmpty());

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());
        //  Set接口：元素无序，不可重复，元素不可以为空
        //      具体的实现类有HashSet、LinkedHashSet、TreeSet

        //  Queue接口：元素有序，可重复，元素不可以为空
        //      具体的实现类有PriorityQueue、LinkedList、ArrayDeque
        //2.成对出现的数据体系：map接口定义了键值对的相关规则
        //  所谓的成对的数据，就是2个数据有关系，可以根据第一个数据关联到第二个数据
        //  也称之为键值对数据，（123123，张三）=>(key,value)
        //  Map接口：元素无序，不可重复，元素不可以为空，键值对数据
        //      具体的实现类有HashMap、LinkedHashMap、TreeMap
        //
        //
        //
        //
        //
    }
}
