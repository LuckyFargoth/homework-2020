package homeworks.interfaces.interfaces2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private String name;
    private String surname;
    private Integer age;


    @Override
    public int compareTo(Person o) {
        int result = this.surname.compareTo(o.getSurname());
        if (result == 0) {
            result = this.name.compareTo(o.getName());
            if (result == 0) {
                result = this.age.compareTo(o.getAge());
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Person clone() {
        try {
            return (Person)super.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

}