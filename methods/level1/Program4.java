package level1;
import java.util.*;
class Program4 {
    public static double getNumberOfRounds(double side1, double side2, double side3,double distance) {
        double perimeter = side1 + side2 + side3;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();
        double distance=5000;
        double rounds = getNumberOfRounds(a, b, c,distance);

        System.out.println("Number of rounds required to complete 5 km: " + rounds);
        sc.close();
    }
}
