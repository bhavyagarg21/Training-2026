import java.util.*;

public class Capitalize {
    public static String capitalize(String s){
        String[] arr=s.split(" ");

        StringBuilder res=new StringBuilder();
        for(String word:arr){
            res.append(
            Character.toUpperCase(word.charAt(0))
            ).append(word.substring(1).toLowerCase()
            ).append(' ');

        }
        s=res.toString().trim();
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(capitalize(s));
        sc.close();
    }
}
