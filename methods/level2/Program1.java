import java.util.*;

public class Program1 {
    public static int[] findFactors(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) cnt++;
        }
        int[] arr=new int[cnt];
        int j=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[j]=i;
                j++;
            }
        }
        return arr;
    }
    public static int factorsSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static long factorsProduct(int[] arr){
        long product=1;
        for(int i=0;i<arr.length;i++){
            product*=arr[i];
        }
        return product;
    }
    public static double sumOfSquare(int[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.pow(arr[i],2);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        int[] factorsArr= findFactors(num);
        int sum=factorsSum(factorsArr);
        long product=factorsProduct(factorsArr);
        double sumOfSquares=sumOfSquare(factorsArr);
        System.out.println("Factors: " + Arrays.toString(factorsArr));
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        sc.close();
    }
}
