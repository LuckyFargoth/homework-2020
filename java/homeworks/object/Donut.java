package homeworks.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Donut {
    private final  int price = 50;
    private String type;

    @Override
    public String toString() {
        return type + '(' + price + "р." + ')';
    }


}
