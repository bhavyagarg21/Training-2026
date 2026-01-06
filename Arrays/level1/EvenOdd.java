import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        if(number<1){
            System.out.println("error");
            sc.close();
            return;
        }
        int[] even=new int[number/2+1];
        int[] odd=new int[number/2+1];
        int k=0,j=0;

        for(int i=1;i<=number;i++){
            if(i%2==0){
                even[k]=i;
                k++;
            }
            else{
                odd[j]=i;
                j++;
            }
        }
        System.out.println("Even numbers:");
        for(int i=0;i<k;i++){
            System.out.println(even[i]);
        }
        System.out.println("Odd numbers:");
        for(int i=0;i<j;i++){
            System.out.println(odd[i]);
        }
        sc.close();
    }
}
