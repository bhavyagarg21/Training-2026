import java.util.*;
public class Program3 {
    public static boolean isLeapYear(int year){
        return (year>=1582 && ((year%4==0)&& (year%100!=0)) || year%400==0);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the year: ");
        int year=sc.nextInt();
        boolean res=isLeapYear(year);
        if(res==true) System.out.println("The year is a leap year");
        else  System.out.println("The year is not a leap year");
        sc.close();
    }
}
