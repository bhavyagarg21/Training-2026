import java.util.*;
public class RemoveDuplicates {
    public static String removeDuplicates(String s){
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(Character ch:set){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeDuplicates(s));
        sc.close();
    }
}
