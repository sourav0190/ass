import java.util.Scanner;

public class pg7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find all primes up to it: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("No primes up to " + n + ".");
            sc.close();
            return;
        }

        System.out.println("Primes up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
