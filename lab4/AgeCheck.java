

// // // Program to add two distances (in meters and centimeters)
// // import java.util.Scanner;

// // class Distance {
// //     int meter;
// //     int centimeter;

// //     // Method to input distance
// //     void getData() {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter distance in meters: ");
// //         meter = sc.nextInt();
// //         System.out.print("Enter distance in centimeters: ");
// //         centimeter = sc.nextInt();
// //     }

// //     // Method to add two distances
// //     Distance addDistance(Distance d2) {
// //         Distance result = new Distance();
// //         result.centimeter = this.centimeter + d2.centimeter;
// //         result.meter = this.meter + d2.meter;

// //         // Convert centimeters to meters if ≥ 100
// //         if (result.centimeter >= 100) {
// //             result.meter += result.centimeter / 100;
// //             result.centimeter = result.centimeter % 100;
// //         }

// //         return result;
// //     }

// //     // Method to display distance
// //     void display() {
// //         System.out.println("Distance = " + meter + " meters " + centimeter + " centimeters");
// //     }

// //     // Main method
// //     public static void main(String[] args) {
// //         Distance d1 = new Distance();
// //         Distance d2 = new Distance();

// //         System.out.println("Enter first distance:");
// //         d1.getData();

// //         System.out.println("Enter second distance:");
// //         d2.getData();

// //         Distance sum = d1.addDistance(d2);

// //         System.out.println("\nAfter adding both distances:");
// //         sum.display();
// //     }
// // }
// 2
// public class SingleTryCatch {
//     public static void main(String[] args) {
//         try {
//             int num = 10 / 0;
//             System.out.println(num);
//         } catch (ArithmeticException e) {
//             System.out.println("Cannot divide by zero!");
//         }
//     }
// }
// 3
// import java.util.Scanner;

// public class MultipleCatch {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         try {
//             // Step 1: Take array input
//             System.out.print("Enter size of array: ");
//             int size = sc.nextInt();
//             int[] arr = new int[size];

//             System.out.println("Enter " + size + " elements:");
//             for (int i = 0; i < size; i++) {
//                 arr[i] = sc.nextInt();
//             }

//             // Step 2: Try accessing an element
//             System.out.print("Enter index to access: ");
//             int index = sc.nextInt();
//             System.out.println("Element at index " + index + " = " + arr[index]);

//             // Step 3: Try dividing two numbers
//             System.out.print("Enter numerator: ");
//             int num1 = sc.nextInt();
//             System.out.print("Enter denominator: ");
//             int num2 = sc.nextInt();

//             int result = num1 / num2;
//             System.out.println("Result = " + result);
//         }

//         // Catch specific errors
//         catch (ArithmeticException e) {
//             System.out.println("Arithmetic error: "  );
//         }
//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array index error: " );
//         }
//         catch (Exception e) {
//             System.out.println("Other error: ");
//         }

//         System.out.println("Program finished safely!");
//     }
// }


// 4
// import java.util.*;

// public class FinallyExample {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         try {
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int result = a / b;  // might throw ArithmeticException if b = 0
//             System.out.println("Result = " + result);
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Caught: ");
//         }
//         finally {
//             System.out.println("This runs no matter what!");
//         }
//     }
// }

// 5
// Base custom exception class
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

// Subclass 1: TooYoungException
class TooYoungException extends AgeException {
    public TooYoungException(String message) {
        super(message);
    }
}

// Subclass 2: InvalidAgeException
class InvalidAgeException extends AgeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeCheck {
    
    // Method that can throw AgeException
    static void checkAge(int age) throws AgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid Age: Must be between 0 and 120.");
        } else if (age < 18) {
            throw new TooYoungException("Too Young: Minimum age is 18.");
        } else {
            System.out.println("Eligible for registration!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);   // You can change this value to test different cases
        } 
        catch (TooYoungException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        catch (AgeException e) {
            System.out.println("General Age Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Age verification process completed.");
        }
    }
}


