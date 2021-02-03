package homeworks.map;

import homeworks.exceptions.CustomException;

import java.util.*;

public class HomeworkMap {
    public static void main(String[] args) {


        Map<Customer, Fruit> customers = new HashMap<>();
        Customer chuck = new Customer("Chuck");
        Customer ben = new Customer("Ben");
        Customer archie = new Customer("Archie");
        Customer arnold = new Customer("Arnold");
        Customer willie = new Customer("Willie");
        Fruit banana = new Fruit("Banana", 0.2);
        Fruit melon = new Fruit("Melon", 4.0);
        Fruit watermelon = new Fruit("Watermelon", 7.0);
        Fruit mango = new Fruit("Mango", 0.1);
        Fruit apple = new Fruit("Apple", 0.1);

        customers.put(chuck, melon);
        customers.put(ben, banana);
        customers.put(archie, watermelon);


        System.out.println("customers.get(chuck) = " + customers.get(chuck));
        // adding elements
        Map<Customer, Fruit> fruits = new HashMap<>();
        fruits.put(chuck, melon);
        fruits.put(willie, watermelon);
        fruits.put(arnold, melon);
        fruits.put(archie, apple);
        fruits.put(ben, watermelon);

        System.out.println("customers.remove(archie) = " + customers.remove(archie));
        System.out.println("customers.containsKey(ben) = " + customers.containsKey(ben));
        System.out.println("customers.containsValue(mango) = " + customers.containsValue(mango));


        //fruits.putAll(customers);


        for (Customer key : fruits.keySet()) {
            System.out.println(key);
        }

        System.out.println();

        for (Map.Entry<Customer, Fruit> item : fruits.entrySet()) {
            System.out.println(item.getValue());
        }

        for (Map.Entry<Customer, Fruit> fruit : fruits.entrySet()) {
            System.out.println(fruit.getKey() + ":" + fruit.getValue());
        }

        System.out.println();

        for (Map.Entry<Customer, Fruit> customer : fruits.entrySet()) {
            if (customer.getKey().getName().length() >= 5) {
                System.out.println(customer.getKey());
            }
        }

        System.out.println();

        var counter = 0;
        for (Map.Entry<Customer, Fruit> fruit : fruits.entrySet()) {
            if (fruit.getValue().getName().equals("Melon")) {
                counter++;
            }
        }
        System.out.println("amount of elements equal to \"Melon\"" + counter);


        System.out.println();

        System.out.println("elements with no watermelon value");
        for (Map.Entry<Customer, Fruit> fruit : fruits.entrySet()) {
            if (!fruit.getValue().getName().equals("Watermelon")) {
                System.out.println(fruit.getKey() + " " + fruit.getValue());
            }
        }

        System.out.println("\nelements with no \"A\" char");
        Character firstLetter = ' ';
        for (Map.Entry<Customer, Fruit> fruit : fruits.entrySet()) {
            firstLetter = fruit.getKey().getName().charAt(0);
            if (!firstLetter.equals('A')) {
                System.out.println(fruit.getKey() + " " + fruit.getValue());
            }
        }

        System.out.println("\nFirst watermelon");
        for (Map.Entry<Customer, Fruit> item : fruits.entrySet()) {
            if(item.getValue().getName().equalsIgnoreCase("Watermelon")){
                System.out.println(item.getKey() + " " + item.getValue());
                break;
            }
        }

        System.out.println("\n copied Map (all mellon)");
        Map<Customer, Fruit> resMap = new HashMap<>();
        for (Map.Entry<Customer, Fruit> item : fruits.entrySet()) {
            if (item.getValue().getName().equalsIgnoreCase("melon")) {
                resMap.put(item.getKey(), item.getValue());
            }
        }
        System.out.println("new Map with mellon" + "\n" + resMap.toString());

        System.out.println("\naverage weight");
        double weight  = 0.0;
        int count = 0;
        for (Map.Entry<Customer, Fruit> item : fruits.entrySet()) {
            weight += item.getValue().getWeight();
            count++;
        }
        System.out.println(weight / count);
    }
}