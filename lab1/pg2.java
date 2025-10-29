import java.util.Scanner;

public class pg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci series up to " + n + ": ");
        System.out.print(a + ", " + b);

        int nextTerm;
        while ((nextTerm = a + b) <= n) {
            System.out.print(", " + nextTerm);
            a = b;
            b = nextTerm;
        }

        scanner.close();
    }
}