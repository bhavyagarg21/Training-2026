package level1;
import java.util.*;
public class Program6 {
    public static boolean isSpring(int m, int d){
        if((m==3 && d>=20) ||
        (m==4) || (m==5) ||
        (m==6 && d<=20)) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month: ");
        int month=sc.nextInt();
        System.out.println("Enter day: ");
        int day=sc.nextInt();
        boolean res=(isSpring(month, day));
        if(res==true) System.out.println("It's a Spring Season");
        else System.out.println("Not a Spring Season");
        sc.close();
    }
}
