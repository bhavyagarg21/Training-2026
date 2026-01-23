import java.util.*;

public class CountEvenOdd {
    public static int[] count(int n){
        int evenCnt=0, oddCnt=0;
        while(n!=0){
            int digit=n%10;
            if(digit%2==0) evenCnt++;
            else oddCnt++;
            n/=10;
        }
        return new int[]{evenCnt,oddCnt};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int[] arr=count(n);
        System.out.println("Number of even digits: "+ arr[0]);
        System.out.println("Number of odd digits: "+ arr[1]);
        sc.close();
    }
}
