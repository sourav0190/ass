import java.util.Scanner;
class AreaCalculator {
    double area(double side) {
        return side * side;
    }
    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class pg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();
        System.out.println("Area of Square: " + calc.area(s));

        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + calc.area(l, b));

        System.out.print("\nEnter base and height of triangle: ");
        double base = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of Triangle: " + calc.area(base, h, true));

        sc.close();
    }
}
