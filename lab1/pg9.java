import java.util.Scanner;

public class pg9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("'" + ch + "' is a vowel.");
            default -> System.out.println("'" + ch + "' is not a vowel.");
        }

        sc.close();
    }
}
