import java.util.*;

public class Duplicate {
    public static ArrayList<Integer> duplicate(int[] arr, int n){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(set.contains(arr[i]) && !list.contains(arr[i])){
                list.add(arr[i]);
            } 
            set.add(arr[i]);
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> temp=duplicate(arr, n);
        for(int i:temp) System.out.print(i+" ");
        sc.close();
    }
}
