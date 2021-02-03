package homeworks.hw2OOP.figures;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private double height;



    @Override
    public double getPerimeter() {
       double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = (sideA/2) * height;
        return area;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        return Double.compare(this.getArea(), ((Triangle) o).getArea()) == 0
                && Double.compare(this.getArea(), ((Triangle) o).getArea()) == 0;
    }

}
