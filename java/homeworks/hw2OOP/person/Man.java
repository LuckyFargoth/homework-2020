package homeworks.hw2OOP.person;

import lombok.Getter;


@Getter

public class Man extends Person {
    private final boolean isMan = true;
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
