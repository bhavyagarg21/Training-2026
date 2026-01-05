import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        System.out.print("Factors of " + number + " are: ");

        // Initialize counter
        int i = 1;

        // While loop to find factors
        while (i < number) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++; // Increment counter
        }
        sc.close();
    }
}

