import java.util.Scanner;

class Area {

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    int calculateArea(int side) {
        return side * side;
    }

    double calculateArea(double base, double height, int triangle) {
        return 0.5 * base * height;
    }
}

public class AreaOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + obj.calculateArea(r));

        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.calculateArea(l, b));

        System.out.print("Enter side of square: ");
        int s = sc.nextInt();
        System.out.println("Area of Square: " + obj.calculateArea(s));

        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + obj.calculateArea(base, height, 1));

        sc.close();
    }
}