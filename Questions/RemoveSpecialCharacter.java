import java.util.*;
public class RemoveSpecialCharacter {
    public static String removeSpecialCharacter(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)) || Character.isWhitespace(s.charAt(i)))
            sb.append(s.charAt(i));
        }
        return sb.toString().trim();
         
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        s=removeSpecialCharacter(s);
        System.out.println(s);
        sc.close();
    }
}
