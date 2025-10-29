import java.util.Scanner;

public class pg3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerical percentage: ");
        double percentage = scanner.nextDouble();

        if (percentage >= 0 && percentage <= 100) {
            if (percentage >= 90) {
                System.out.println("The assigned grade is: A");
            } else {
                if (percentage >= 80) {
                    System.out.println("The assigned grade is: B");
                } else {
                    if (percentage >= 70) {
                        System.out.println("The assigned grade is: C");
                    } else {
                        if (percentage >= 60) {
                            System.out.println("The assigned grade is: D");
                        } else {
                            System.out.println("The assigned grade is: F");
                        }
                    }
                }
            }
        } else {
            System.out.println("Invalid percentage entered. Please enter a value between 0 and 100.");
        }

        scanner.close();
    }
}