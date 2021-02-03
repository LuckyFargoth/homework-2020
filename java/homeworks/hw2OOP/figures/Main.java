package homeworks.hw2OOP.figures;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,3,4);
        Triangle triangle1 = new Triangle(1,2,3,5);
        Triangle triangle2 = new Triangle(1,2,3,4);
        //TODO - add try/catch block for impossible combs;
        Square square = new Square(4);

        Rectangle rectangle = new Rectangle(3,4);
        Rectangle rectangle2 = new Rectangle(2,5);
        Rectangle rectangle3 = new Rectangle(3,4);



        System.out.println("triangle.getArea() = " + triangle.getArea());
        System.out.println("triangle.getPerimeter() = " + triangle.getPerimeter());
        System.out.println("square.getArea() = " + square.getArea());
        System.out.println("square.getPerimeter() = " + square.getPerimeter());
        System.out.println("rectangle.getArea() = " + rectangle.getArea());
        System.out.println("rectangle.getPerimeter() = " + rectangle.getPerimeter());

        System.out.println("rectangle.equals(rectangle2) = " + rectangle.equals(rectangle2));
        System.out.println("rectangle.equals(rectangle3) = " + rectangle.equals(rectangle3));

        System.out.println("triangle.equals(triangle1) = " + triangle.equals(triangle1));
        System.out.println("triangle.equals(triangle2) = " + triangle.equals(triangle2));
    }
}
