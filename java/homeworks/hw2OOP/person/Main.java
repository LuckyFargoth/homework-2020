package homeworks.hw2OOP.person;

public class Main {
    public static void main(String[] args) {
        Person sonya = new Woman("Sonya", 30);
        Person nova = new Woman("nova", 24);
        Person artanis = new Man("Artanis", 120);
        Person alarakh = new Man("Alarakh", 150);
        System.out.println(sonya.isMale());
        System.out.println(nova.getAge());

        Person[] persons = new Person[] {sonya, nova, artanis, alarakh};
        for (Person ps: persons) {
            System.out.println(ps.getName() + ": " + ps.getAge() + " " + "y.o.");
        }

    }
}
