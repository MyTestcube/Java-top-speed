package chapter05;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java06_Object_Data {
    public static void main(String[] args) {
        //todo 常见类和对象
        //Date：日期类
        //时间戳：毫秒
        //
        System.out.println(System.currentTimeMillis());

        //Date：日期类
        //calendar：日历类
        //
        Date d=new Date();
        System.out.println(d);

        //java 日期格式化：
        //y(Y)->年->yyyy
        //m(M)->MM:月份，mm:分钟
        //d(D)->dd:一个月中的日期，D:一年中的日期
        //h(H)->h:12进制，HH:24进制
        //s(S)->s:秒，S->:毫秒
        //

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //
        //
        //日期转字符串date-->string
        String dataFormat=sdf.format(d);
        System.out.println(dataFormat);


        //字符串转日期string-->date
        String dateString = "2020-11-11";
        try {
            Date parseDate = sdf.parse(dateString);
            System.out.println(parseDate);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }


        //根据时间戳构建指定日期对象
//        d.setTime(System.currentTimeMillis());
        //获取时间戳
//        d.getTime();
        System.out.println();
    }
}
