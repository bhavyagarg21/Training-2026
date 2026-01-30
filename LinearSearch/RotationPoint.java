import java.util.*;

public class RotationPoint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0, r=n-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]>arr[r]) l=mid+1;
            else if(arr[mid]<arr[r]) r=mid;
        }
        System.out.println(arr[l]);
        sc.close();
    }
}
