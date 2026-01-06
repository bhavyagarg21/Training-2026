import java.util.*;
public class Factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int maxFactor=10;
        int[] factors=new int[maxFactor];
        int j=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                if(j==maxFactor){
                    maxFactor*=2;
                    int[] temp=new int[maxFactor];
                    for(int k=0;k<factors.length;k++){
                        temp[k]=factors[k];
                    }
                    factors=temp;
                }
                factors[j]=i;
                j++;
            }
        }
        System.out.println("Factors of " + num + ":");
        for (int i = 0; i < j; i++) {
            System.out.println(factors[i]);
        }
        sc.close();
    }
}
