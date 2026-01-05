import java.util.*;
public class Program6 {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Input heights
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = sc.nextInt();

        // Find youngest friend
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = "";
        if (minAge == ageAmar) youngest = "Amar";
        else if (minAge == ageAkbar) youngest = "Akbar";
        else youngest = "Anthony";

        // Find tallest friend
        int maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = "";
        if (maxHeight == heightAmar) tallest = "Amar";
        else if (maxHeight == heightAkbar) tallest = "Akbar";
        else tallest = "Anthony";

        // Display results
        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
        sc.close();
    }
}
