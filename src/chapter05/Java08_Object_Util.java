package chapter05;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Java08_Object_Util {
    public static void main(String[] args) throws Exception {
        //todo 常见类和对象
        //

        System.out.println(StringUtil.isEmpty(""));
        System.out.println(StringUtil.isEmpty(null));
        System.out.println(StringUtil.isEmpty("  "));
        System.out.println(StringUtil.isEmpty("abc"));

        System.out.println(StringUtil.makeString());
        System.out.println(StringUtil.makeString("abcsdf123456",6));
        System.out.println(StringUtil.formatDate(new Date(),"yyyy-MM-dd"));
        System.out.println(StringUtil.parseDate("2024-05-08","yyyy-MM-dd"));
    }
}
class StringUtil {
    public static boolean isEmpty(String str) {
//        if (str == null) {
//            return true;
//        }
//        if ("".equals(str)){
//            return true;
//        }
//        if ("".equals(str.trim())) {
//            return true;
//        }
        if (str == null ||  "".equals(str.trim())) {
            return true;
        }
        return false;
    }
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
    public static String makeString() {
        return UUID.randomUUID().toString();
    }
    public static String makeString(String from,int length) {
        if (length < 1) {
            return "";
        }else {
            char[] chars = from.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                Random random = new Random();
                int index = random.nextInt(chars.length);
                char c = chars[index];
                sb.append(c);
            }
            return sb.toString();
        }
    }
    public static String transform(String source, String encodefrom, String encodeto) throws Exception {
        byte[] bytes = source.getBytes(encodefrom);
        return new String(bytes, encodeto);
    }

    public static Date parseDate(String dateStr, String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(dateStr);
    }
    public static String formatDate(Date date, String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}