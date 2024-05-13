package chapter05;


import java.util.Calendar;

public class Java07_Object_Date {
    public static void main(String[] args) {
        //todo 常见类和对象
        //
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));
        System.out.println(instance.get(Calendar.DATE));

//        instance.setTime(new Date());
    }
}
