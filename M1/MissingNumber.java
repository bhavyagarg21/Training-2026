import java.util.*;
public class MissingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];   
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){ 
            sum+=(i+1)-(arr[i]);
        }
        sum+=n+1;
        System.out.println(sum);
        sc.close();
    }
} 
