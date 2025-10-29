import java.util.Scanner;

public class pg5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number or a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        try {
            long number = Long.parseLong(input);
            checkNumberPalindrome(number);
        } catch (NumberFormatException e) {
            checkStringPalindrome(input);
        } finally {
            scanner.close();
        }
    }

    public static void checkNumberPalindrome(long number) {
        long originalNumber = number;
        long reversedNumber = 0;
        
        while (number != 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }

    public static void checkStringPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println("'" + str + "' is a palindrome.");
        } else {
            System.out.println("'" + str + "' is not a palindrome.");
        }
    }
}
