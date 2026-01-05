import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        System.out.print("Factors of " + number + " are: ");

        // Loop to find factors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
 