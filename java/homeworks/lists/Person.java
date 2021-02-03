package homeworks.lists;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
public class Person {
    private boolean isMale;
    private String name;
    private int age;


    @Override
    public String toString() {
        return  name + " " +
                 + age + " ";
    }
}
