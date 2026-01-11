import java.util.*;
public class SumOfEvenPosition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        String s=String.valueOf(n);
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sum+=s.charAt(i)-'0';
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
