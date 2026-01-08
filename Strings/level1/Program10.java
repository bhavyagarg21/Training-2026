import java.util.*;

public class Program10 {
    public static String convertLowercase(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z') ch=(char)(ch+32);
            sb.append(ch);
        }
        s= sb.toString();
        return s;
    }
    public static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text: ");
        String s=sc.nextLine();
        String res1=convertLowercase(s);
        String res2=s.toLowerCase();

        if(compare(res1,res2)) System.out.println("both display same result");
        else System.out.println("both don't display same result");
        sc.close();
    }
}
