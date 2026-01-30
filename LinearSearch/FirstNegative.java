import java.util.*;
class FirstNegative{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                j=i;
                break;
            }
        }
        System.out.println(j);
        sc.close();

    }
}
