import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        StringBuilder sb=new StringBuilder();
        sb.append(word);
        sb.reverse();
        System.out.println(sb.toString());
        sc.close();
    }
}
