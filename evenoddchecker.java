import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Asking the user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Friendly message
        System.out.println("Nice choice! " + number + " is a good number.");

        // Checking even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }

        sc.close();
    }
}
