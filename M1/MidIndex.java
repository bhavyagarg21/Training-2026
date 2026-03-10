import java.util.*;
public class MidIndex {
    public static int mid(int[] arr, int n){
        int mid=n/2;
        int res=0;
        if(n%2!=0) res= arr[mid];
        else{
            if(arr[mid]<0 || arr[mid-1]>0) res= arr[mid-1];
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];   
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(mid(arr,n));
        sc.close();
    }
}
