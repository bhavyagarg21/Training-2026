import java.util.*;

public class Program5
 {
    static void findYoungest(String[] names, int[] age) {
        int minIndex = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println("Youngest Friend: " + names[minIndex] +" (Age: " 
        + age[minIndex] + ")");
    }

    static void findTallest(String[] names, double[] height) {
        int maxIndex = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Tallest Friend: " + names[maxIndex] +" (Height: " 
        + height[maxIndex] + " cm)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            height[i] = sc.nextDouble();
        }

        findYoungest(names, age);
        findTallest(names, height);

        sc.close();
    }
}
