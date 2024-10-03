package shapeProject;

public class MainClass {
    public static void main(String[] args) {
       
        Shape shape = new Shape("blue", false);
        System.out.println(shape);

        
        Circle circle = new Circle(5.5, "green", true);
        System.out.println(circle);
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());

        
        Rectangle rectangle = new Rectangle(2.0, 4.0, "yellow", false);
        System.out.println(rectangle);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());

        
        Square square = new Square(3.0, "red", true);
        System.out.println(square);
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Perimeter of Square: " + square.getPerimeter());
    }
}

