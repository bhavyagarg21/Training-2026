import java.util.*;

public class RemoveVowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text: ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='a'&& ch!='e' && ch!='i' && ch!='o' && ch!='u') sb.append(ch);
        }
        s=sb.toString().trim();
        System.out.println(s);
        sc.close();
    }
}
