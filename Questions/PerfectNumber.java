import java.util.*;
public class PerfectNumber {
    public static boolean isPerfect(int n){
        int sum=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) sum+=i;
        }
        return (sum==n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(isPerfect(n)) System.out.println("It's perfect"); 
        else System.out.println("It's not perfect"); 
        sc.close();
    }
}
