import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            sc.close();
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) { 
                isPrime = false;
                break; 
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        sc.close();
    }
}
