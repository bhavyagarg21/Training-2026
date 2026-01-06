import java.util.*;
public class TwoDArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col=sc.nextInt();
        int[][] arr2=new int[rows][col];
        int[] arr1=new int[rows*col];
        System.out.println("Enter elements of the 2D array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr1[k]=arr2[i][j];
                k++;
            }
        }
        System.out.println("Elements of the 1D array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        sc.close();
    }
}
