import java.util.*;
class TwoSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=target-arr[i];
            if(map.containsKey(val)){
                System.out.println(map.get(val)+" "+i);
                return;
            }
            map.put(arr[i],i);
        }
        sc.close();
    }
}