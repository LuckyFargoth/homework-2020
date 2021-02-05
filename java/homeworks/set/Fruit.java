package homeworks.set;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Fruit {
    private final String name;
    private final double weight;

    @Override
    public String toString() {
        return name + '(' + "weight: " + weight  + ')';
    }

}
