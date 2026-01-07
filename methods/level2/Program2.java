import java.util.*;
public class Program2 {
    public static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }
    public static int sumFormula(int n){
        return  n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(n<=0){
            sc.close();
            return;
        }
        int res1=sum(n);
        int res2=sumFormula(n);
        System.out.println("Sum using recursion: " + res1);
        System.out.println("Sum using formula: " + res2);
        if (res1 == res2) {
            System.out.println("Both methods give the same result");
        } else {
            System.out.println("Results do not match");
        }
        sc.close();
    }
}
