import java.util.Scanner;

// Interface
interface Shape {
    double area();
    double perimeter();
}

// Circle class
class Circle implements Shape {
    private double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle implements Shape {
    private double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

// Main class with menu
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    System.out.println("Area: " + c.area());
                    System.out.println("Perimeter: " + c.perimeter());
                    break;
                case 2:
                    System.out.print("Enter length of rectangle: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter width of rectangle: ");
                    double w = sc.nextDouble();
                    Rectangle rect = new Rectangle(l, w);
                    System.out.println("Area: " + rect.area());
                    System.out.println("Perimeter: " + rect.perimeter());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}