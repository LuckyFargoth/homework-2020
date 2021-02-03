package homeworks.hw2OOP.figures;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square extends Figure {
    private double side;


    @Override
    public double getPerimeter() {
        double perimeter = side * 4;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

}
