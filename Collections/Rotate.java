
import java.util.*;

public class Rotate {
    public static void reverse(List<Integer> list, int start, int end) {
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
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int position=sc.nextInt();
        reverse(list,0,position-1);
        reverse(list,position,n-1);
        reverse(list,0,n-1);

        for(int num:list){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
