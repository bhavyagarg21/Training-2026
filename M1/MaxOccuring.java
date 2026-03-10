import java.util.*;
public class MaxOccuring {
    public static Character max(String s){
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        char res='0';
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
    
        int maxi=map.get(s.charAt(0));
        for(Character ch:map.keySet()){
            int val=map.get(ch);
            if(val>maxi){
                maxi=val;
                res=ch;
            } 
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(max(s));
        sc.close();
    }
}
