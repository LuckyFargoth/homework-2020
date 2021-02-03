package homeworks.hw2OOP.person;

import lombok.Getter;

@Getter

public class Woman extends Person {
    private final boolean isMale = false;
    private String name;
    private int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printAge() {
        System.out.println("Всегда 18");
    }



}
