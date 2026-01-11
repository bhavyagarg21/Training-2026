import java.util.*;
public class Transpose {
    public static int[][] getTranspose(int[][] matrix, int rows, int columns){
        int[][] t=new int[columns][rows];
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                t[j][i]=matrix[i][j];
            }
        }
        return t;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns=sc.nextInt();

        int[][] matrix=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int[][] transpose=getTranspose(matrix,rows,columns);
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print((transpose[i][j]+" "));
            }
            System.out.println();
        }
        sc.close();
    }
}
