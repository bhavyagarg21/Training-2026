import java.util.*;
public class Program1 {
    public static void main(String[] args){
        int n=10;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0) System.out.println("invalid age");
            else if(arr[i]>=18) System.out.println("The student with the age "+arr[i]+" can vote");
            else System.out.println("The student with the age "+arr[i]+" cannot vote");
        }
        sc.close();
    }
}
