import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for first matrix: ");
        int r1=sc.nextInt();
        System.out.println("Enter the number of columns for first matrix: ");
        int c1=sc.nextInt();
        
        int r2=c1;
        System.out.println("Enter the number of columns for second matrix: ");
        int c2=sc.nextInt();

        int[][] matrix1=new int[r1][c1];
        int[][] matrix2=new int[r2][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[r1][c2];
       for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            int sum=0;
            for(int k=0;k<c1;k++){
                sum+=(matrix1[i][k]*matrix2[k][j]);
            }
            res[i][j]=sum;
        }
       }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
