package homeworks.set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HomeworkSet {
    public static void main(String[] args) {
        Set<Fruit> fruits = new HashSet<>();
        Fruit melon = new Fruit("Melon", 5.0);
        Fruit watermelon = new Fruit("Watermelon", 6.0);
        Fruit apple = new Fruit("Apple", 0.3);

        System.out.println("fruits.add(melon) = " + fruits.add(melon));
        System.out.println("fruits.add(melon) = " + fruits.add(melon));

        System.out.println("fruits.add(watermelon) = " + fruits.add(watermelon));
        fruits.add(apple);
        Iterator<Fruit> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            Fruit next = iterator.next();
            System.out.print(next + " ");
            System.out.println();
        }
        System.out.println("fruits.remove(watermelon) = " + fruits.remove(watermelon));
        System.out.println("fruits.contains(watermelon) = " + fruits.contains(watermelon));


    }
}
