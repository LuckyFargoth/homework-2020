package homeworks.interfaces.interfaces2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person andrey = new Person("andrey", "leshinski", 30);
        Person vasya = new Person("vasya", "leshinski", 30);
        Person andrey2 = new Person("andrey", "leshinski", 29);
        Person nate = new Person("nate", "diaz", 35);
        ArrayList<Person> guys = new ArrayList<>(Arrays.asList(andrey, andrey2, vasya, nate));
        Collections.sort(guys);
        System.out.println(guys);
    }
}
