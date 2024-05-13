package chapter05;


public class Java09_Object {
    public static void main(String[] args) throws Exception {
        //todo 常见类和对象
        //

        int i = 10;
        int j = 10;
        System.out.println(i==j);
        double d=10.0;
        System.out.println(i==d);

        String s = "abc";
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s==s1);
        System.out.println(s==s2);
        System.out.println(s.equals(s2));

        User9 u1 = new User9();
        User9 u2 = new User9();
        System.out.println(u1==u2);

        System.out.println(u1.equals(u2));
    }
}
class User9{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}