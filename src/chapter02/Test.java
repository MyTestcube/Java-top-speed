package chapter02;


import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
//        for (Day day : Day.values()) {
//            System.out.println(day);
//        }
        BigInteger n = new BigInteger("999999").pow(99);
        System.out.println(n);

        float f = n.floatValue();
        System.out.println(f);

    }

}
enum Day {
//    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
MONDAY("modywe-12", 123),
    TUESDAY("Workdawewy", 123),
    WEDNESDAY("Workday", 123),
    THURSDAY("Workday", 123),
    FRIDAY("Workday", 123),
    SATURDAY("Weekend", 123),
    SUNDAY("Weekend", 123);

    private String type;
    private int age;
    Day(String type, int i) {
        this.type = type;
        this.age = i;
    }

    public String getType() {
        return type;
    }
}
