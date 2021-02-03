package homeworks.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age >= 200) throw new IncorrectAgeInputException();
        this.age = age;
    }

    @Override
    public String toString() {
        return "User name: " + getName() +
                "\nUser age: " + getAge();
    }
}

