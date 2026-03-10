import java.util.*;
public class ArrayRemoveDuplicates {
    public static int[] removeDuplicates(int[] arr,int n){
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:set){
            list.add(num);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=removeDuplicates(arr,n);
        for(int i:res){
            System.out.println(i);
        }
        sc.close();
    }
}

