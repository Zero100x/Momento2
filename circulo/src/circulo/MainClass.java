package circulo;

public class MainClass {
    public static void main(String[] args) {
        
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0, "blue");

        System.out.println("Circle 1: " + circle1);
        System.out.println("Area of Circle 1: " + circle1.getArea());

        System.out.println("Circle 2: " + circle2);
        System.out.println("Area of Circle 2: " + circle2.getArea());

        
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(5.0, 10.0, "green");

        System.out.println("\nCylinder 1: " + cylinder1);
        System.out.println("Volume of Cylinder 1: " + cylinder1.getVolume());

        System.out.println("Cylinder 2: " + cylinder2);
        System.out.println("Volume of Cylinder 2: " + cylinder2.getVolume());
    }
}

