import java.util.*;
class TargetSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            int val=target-arr[i];
            if(set.contains(val)){
                System.out.println("Yes there exists a pair");
                return;
            }
            set.add(arr[i]);
        }
        sc.close();
    }
}