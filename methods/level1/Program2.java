package level1;
import java.util.*;
public class Program2 {
    public static int maxNum(int n){
        return  (n * (n - 1)) / 2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int num=sc.nextInt();
        System.out.println(maxNum(num));
        sc.close();

    }
}
