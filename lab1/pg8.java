import java.util.Scanner;


public class pg8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        
        int reversedNumber = 0;
        
        // Use a while loop to extract digits one by one and build the reversed number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        
        System.out.println("The reversed number is: " + reversedNumber);
        
        scanner.close();
    }
}
