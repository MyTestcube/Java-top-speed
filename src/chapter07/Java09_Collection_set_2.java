package chapter07;

import java.util.HashSet;

public class Java09_Collection_set_2 {
    public static void main(String[] args) {
        //todo 集合类

        // Set集合

        HashSet set = new HashSet();

        User9 user1 = new User9();
        user1.name = "Tom";
        user1.id = 1001;
        System.out.println(user1.hashCode());

        User9 user2 = new User9();
        user1.name = "yuanyuan";
        user1.id = 1002;
        System.out.println(user1.hashCode());

        User9 user3 = new User9();
        user1.name = "Jerry";
        user1.id = 1003;
        System.out.println(user1.hashCode());

        set.add(user1);
        set.add(user2);
        set.add(user3);

        System.out.println(set);
    }
}
class User9 {
    public String name;
    public int id;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User9) {
            User9 otheruser = (User9) obj;
            if (this.id == otheruser.id) {
                if (otheruser.name.equals(this.name)){
                    return true;
                }
            }
            return false;
        }else {

            return false;
        }
    }

    @Override
    public String toString() {
        return "user["+id+name+"]";
    }
}