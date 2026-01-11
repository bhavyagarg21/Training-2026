import java.util.*;
public class RotateArray {
    public static void reverse(int[] arr, int i, int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotateLeft(int[] arr, int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void rotateRight(int[] arr, int n,int d){
        rotateLeft(arr,n,n-d);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter the number of positions by which the array should rotate: ");
        int d=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] leftArr=Arrays.copyOf(arr,n);
        int[] rightArr=Arrays.copyOf(arr,n);
        System.out.println("Array when rotated left: ");
        rotateLeft(leftArr,n,d);
        for(int i=0;i<n;i++){
            System.out.print(leftArr[i]+" ");
        }
        System.out.println();
        
        System.out.println("Array when rotated right: ");
        rotateRight(rightArr,n,d);
        for(int i=0;i<n;i++){
            System.out.print(rightArr[i]+" ");
        }

        sc.close();
    }
}
