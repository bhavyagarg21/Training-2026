import java.util.*;
public class Program5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int[] arr=new int[4];

        int i=0;
        for(int j=6;j<=9;j++){
            arr[i]=n*j;
            i++;
        }
        i = 0;
        for (int j = 6; j <= 9; j++) {
            System.out.println(n + " * " + j + " = " + arr[i]);
            i++;
        }
        sc.close();
    }
}
