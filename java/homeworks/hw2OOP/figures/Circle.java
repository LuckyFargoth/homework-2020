package homeworks.hw2OOP.figures;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Figure {

    private int radius;

    @Override
    public double getPerimeter() {
        double perimeter = radius * (PI * 2);

        return 0;
    }

    @Override
    public double getArea() {
        double area = PI * radius * radius;
        return area;
    }
}
