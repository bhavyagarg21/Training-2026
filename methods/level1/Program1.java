package level1;
import java.util.*;
class Program1{
    public static double simpleInterest(double p, double r, double t){
        return (p*r*t)/100;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the principle: ");
        double principle=sc.nextDouble();
        System.out.println("Enetr the rate: ");
        double rate=sc.nextDouble();
        System.out.println("Enetr the time: ");
        double time=sc.nextDouble();
        System.out.println(simpleInterest(principle, rate, time));
        sc.close();
    }
}