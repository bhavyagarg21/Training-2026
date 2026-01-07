package level1;
import java.util.*;
class Program10 {

    public static int[] findRemainderAndQuotient(int numberOfchocolates, int numberOfChildren) {
        if (numberOfChildren == 0) {
        return new int[]{0, 0};
    }
        int quotient = numberOfchocolates / numberOfChildren;
        int remainder = numberOfchocolates % numberOfChildren;

        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfchocolates = sc.nextInt();

        System.out.print("Enter the number of Children: ");
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfchocolates, numberOfChildren);

        System.out.println("Number of chocolates each child gets: " + result[0]);
        System.out.println("Number of remaining chocolates: " + result[1]);

        sc.close();
    }
}
