import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set=new HashSet<>();

       for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
        if(!set.contains(ch)){
            set.add(ch);
            sb.append(ch);
        }
       }
       System.out.println(sb.toString());
       sc.close();
    }
}
