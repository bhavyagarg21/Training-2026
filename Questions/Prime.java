import java.util.*;

public class Prime {
    public static boolean checkPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(checkPrime(num)) System.out.println("Number is prime");
        else System.out.println("Number is not prime");
        sc.close();
    }
}
