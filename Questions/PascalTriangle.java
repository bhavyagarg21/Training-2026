import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[][] p = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    p[i][j] = 1;
                else
                    p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

