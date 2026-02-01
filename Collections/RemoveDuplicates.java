import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Set<Integer> set=new LinkedHashSet<>(list);
        List<Integer> arrL=new ArrayList<>(set);
        System.out.println(arrL);
        sc.close();
    }
}
