import java.util.*;
public class Case {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int cnt1=0,cnt2=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)) cnt1++;
            else if(Character.isLowerCase(ch)) cnt2++;
        }
        if(cnt1> cnt2) s=s.toUpperCase();
        else s=s.toLowerCase();
        System.out.println(s);
        sc.close();
    }
}
