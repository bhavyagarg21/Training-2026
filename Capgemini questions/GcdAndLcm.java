import java.util.*;

public class GcdAndLcm {
    public static int gcd(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();

        int hcf=gcd(num1,num2);
        int lcm=(num1==0 || num2==0)?0:(num1*num2)/hcf;
        System.out.println(hcf);
        System.out.println(lcm);
        sc.close();
    }
}
