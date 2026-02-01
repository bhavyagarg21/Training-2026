import java.util.*;

public class EqualSet {
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
        for(int num:set1){
            if(set1.size() != set2.size()|| (!set2.contains(num))){
                System.out.println("They aren't equal");
                sc.close();
                return;
            } 
        }
        System.out.println("They are equal");
        sc.close();
    }
}
