import java.util.*;
public class MissingNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr=new int[n-1];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int xor1=0;
        for(int i=1;i<=n;i++){
            xor1^=i;
        }
        int xor2=0;
        for(int i=0;i<arr.length;i++){
            xor2^=arr[i];
        }
        System.out.println(xor1^xor2);
        sc.close();
    }
}
