package homeworks.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {


    public static void main(String[] args) {
        //List<Object> list = new ArrayList<>();
        //String[] array = new String[]{};
        List<Integer> list1 = new ArrayList<>(20);


        list1.add(1);
        list1.add(2);


        System.out.println("list1.get(0) = " + list1.get(0));
        System.out.println("list1.get(1) = " + list1.get(1));

        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        list1.set(2, 5);
        list1.set(0, 6);


        List<Integer> list2 = new ArrayList<>(list1);
        list2.remove("5");
        list2.remove(list2.toArray().length - 1);


        for (Integer s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (Integer o : list2) {
            System.out.print(o + " ");
        }
        System.out.println();


        System.out.println("list2.contains(\"5\") = " + list2.contains(5));


        System.out.println(list1.toString());
        System.out.println();

        for (int i = 0; i < list1.size(); i++) {
            if (i % 3 == 0) {
                System.out.print(list1.get(i) + " ");
            }
        }

        System.out.println();

        int counter = 0;
        for (Integer s : list1) {
            if (s == 5) counter++;

        }
        System.out.println(counter);

        System.out.println();

        System.out.println("skip 1st 4");
        for (int i = 3; i < list1.size(); i++) {
            System.out.print(list1.get(i));
        }
        System.out.println();

        System.out.println("divisible by(1st)");
        for (Integer j : list1) {
            if (list1.get(j) % 3 == 0) {
                System.out.println(list1.get(j));
                break;
            }
        }

        System.out.println("all numbers divisible by 3");
        for (int a = 0; a < list1.size(); a++) {
            if (list1.get(a) % 3 == 0) {
                System.out.print(list1.get(a) + " ");
            }
        }
        System.out.println();

        printList(list1);

        Person ivan = new Person(true, "Ivan", 27);
        Person angus = new Person(true, "Angus", 13);
        Person bruce = new Person(true, "Bruce", 20);
        Person ana = new Person(false, "Ana", 22);

        List<Person> people = new ArrayList<>(Arrays.asList(ivan, angus, bruce, ana));
        for (Person p : people) {
            if (p.getAge() >= 18 && p.getAge() <= 28 && p.isMale() == true) {
                System.out.println(p.toString() + "ready to serve!");
            }

        }
    }

    public static void printList(List<Integer> list1) {
        StringBuilder result = new StringBuilder("List: {");
        for (int i = 0; i < list1.size(); i++) {
            result = result.append("\"" + list1.get(i) + "\"");
        }
        result.append('}');
        System.out.println(result);
    }


}
