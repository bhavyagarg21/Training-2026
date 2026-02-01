import java.util.*;
class Reverse{
    public static void reverse(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list1=new ArrayList<>();
        LinkedList<Integer> list2=new LinkedList<>();
        for(int x:arr){
            list1.add(x);
        }
        for(int x:arr){
            list2.add(x);
        }
        reverse(list1);
        reverse(list2);
        System.out.println(list1);
        System.out.println(list2);
        sc.close();
    }
}