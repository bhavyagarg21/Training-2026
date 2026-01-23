import java.util.*;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxi=arr[0];
        int secondLargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                secondLargest=maxi;
                maxi=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<maxi) secondLargest=arr[i];
        }
        System.out.println(secondLargest);
        sc.close();
    }
}
