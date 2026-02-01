import java.util.*;
public class Subset {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        Set<Integer> set1=new HashSet<>();
        for(int i=0;i<m;i++){
            set1.add(sc.nextInt());
        }
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<n;i++){
            set2.add(sc.nextInt());
        }
        if(set1.size()>set2.size()) {
            System.out.println("Not a subset");
            sc.close();
            return;
        }
        for(int num:set1){
            if(!set2.contains(num)){
                System.out.println("Not a subset");
                sc.close();
                return;
            }
        }
        System.out.println("The set is a subset");
        sc.close();
    }
}
