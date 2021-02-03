package homeworks.hw2OOP.person;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private boolean isMale;
    private String name;
    private int age;

    public Person() {
        this.isMale = isMale;
        this.name = name;
        this.age = age;
    }

    public void printAge() {
        System.out.println(age);
    }
}
