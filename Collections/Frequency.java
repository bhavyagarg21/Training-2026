import java.util.*;

public class Frequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(String num:list){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(String key:map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
        sc.close();
    }
}
