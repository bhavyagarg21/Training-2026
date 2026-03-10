import java.util.*;

public class LargestWord {
    public static String word(String s){
        int n=s.length();
        if(n<=2) return s;
        return s.charAt(0)+ ""+(n-2) +s.charAt(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(word(s));
        sc.close();
    }
}
