import java.util.*;
public class SortedList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:set){
            list.add(num);
        }
        Collections.sort(list);
        System.out.println(list);
        sc.close();
    }
}
