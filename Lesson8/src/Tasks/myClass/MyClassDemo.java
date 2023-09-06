package Tasks.myClass;

import java.util.HashSet;

import static java.lang.System.out;

public class MyClassDemo {
    public static void main(String[] args) {
        HashSet<User> userSet = new HashSet<>();

        User user1 = new User("John", 25, "123-456-7890");
        User user2 = new User("Dima", 30, "987-654-3210");
        User user3 = new User("John", 28, "555-555-5555");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        for (User user : userSet) {
            out.println(user);
        }
    }
}







