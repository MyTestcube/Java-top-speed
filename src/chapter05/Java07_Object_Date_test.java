package chapter05;


import java.util.Calendar;

public class Java07_Object_Date_test {
    public static void main(String[] args) {
        //todo 常见类和对象
        //
        System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日\t");

        Calendar firstDay = Calendar.getInstance();

        firstDay.set(Calendar.DAY_OF_MONTH, 1);

        int maxday = firstDay.getMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < maxday; i++) {
            int weekx = firstDay.get(Calendar.DAY_OF_WEEK);

            int monthy = firstDay.get(Calendar.DAY_OF_MONTH);
            if (i == 0) {
                if (weekx == Calendar.SUNDAY) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("\t");
                    }

                    System.out.print(monthy);
                }else {
                    for (int j = 0; j < weekx-2; j++) {
                        System.out.print("\t");
                    }
                    System.out.print(monthy + "\t");
                }
            } else {
                if (weekx == Calendar.SUNDAY){
                    System.out.println(monthy);
                }else{
                    System.out.print(monthy + "\t");
                }
            }

            firstDay.add(Calendar.DATE, 1);
        }
    } 
}
