import java.util.*;
public class BinaryToDecimal {
    public static String decimalToBinary(int n){
        String s="";
        while(n!=0){
            s=n%2+s;
            n/=2;
        }
        return s;
    }
    public static int binaryToDecimal(String s){
        int n=s.length();
        int j=0;
        int num=0;
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='1') num+=(1<<j);
            j++;
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n=sc.nextInt();

        System.out.println("Enter the binary number: ");
        String s=sc.next();

        System.out.println(decimalToBinary(n));
        System.out.println(binaryToDecimal(s));

        sc.close();
    }
}
