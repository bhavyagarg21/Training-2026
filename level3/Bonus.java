import java.util.*;

public class Bonus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary: ");
        double salary=sc.nextDouble();
        System.out.println("enter year of service: ");
        int service_year=sc.nextInt();
        if(service_year>5){
            double bonus=salary*5/100;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus");
        }
        sc.close(); 
        }


    }

