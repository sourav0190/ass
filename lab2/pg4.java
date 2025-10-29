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
class Box {
    double length, breadth, height;

    // Constructor
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class pg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        // Square
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        System.out.println("Area of Square: " + calc.area(side));

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        System.out.println("Area of Rectangle: " + calc.area(length, breadth));

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + calc.area(base, height, true));

        // Box
        System.out.print("Enter length of box: ");
        double bl = sc.nextDouble();
        System.out.print("Enter breadth of box: ");
        double bb = sc.nextDouble();
        System.out.print("Enter height of box: ");
        double bh = sc.nextDouble();
        Box myBox = new Box(bl, bb, bh);
        System.out.println("Volume of Box: " + myBox.volume());

        sc.close();
    }
}
