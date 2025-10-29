import java.util.Scanner;

public class pg6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers you want to print: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            scanner.close();
            return;
        }

        int count = 0;
        int number = 2;
        System.out.println("The first " + n + " prime numbers are:");

        while (count < n) {
            boolean isPrime = true;
            if (number <= 1) isPrime = false;
            else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }

        scanner.close();
    }
}
