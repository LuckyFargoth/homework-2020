package homeworks.hw2OOP.figures;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Figure {
    private double length;
    private double width;



    @Override
    public double getPerimeter() {
        double perimeter = (length + width) * 2;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        return Double.compare(this.getPerimeter(), ((Rectangle) o).getPerimeter()) == 0
                && Double.compare(this.getPerimeter(), ((Rectangle) o).getPerimeter()) == 0;
    }
}
