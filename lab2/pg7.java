
class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed.");
            return 0;
        }
        return (double) a / b;
    }
}

public class pg7 {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();

        System.out.println("Addition: " + obj.add(10, 5));
        System.out.println("Subtraction: " + obj.subtract(10, 5));
        System.out.println("Multiplication: " + obj.multiply(10, 5));
        System.out.println("Division: " + obj.divide(10, 5));
    }
}
