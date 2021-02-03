package homeworks.map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Fruit {
    private String name;
    private double weight;

    @Override
    public String toString() {
        return  name + '(' + "weight: " + weight + ')';

    }
}
