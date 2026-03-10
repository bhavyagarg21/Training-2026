import java.util.*;
public class Anagram {
    public static String checkAnagram(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        if(m!=n) return "no";
        int[] hash=new int[26];
        for(int i=0;i<m;i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            hash[ch1-'a']++; 
            hash[ch2-'a']--;
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]!=0) return "no";
        }
        return "yes";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(checkAnagram(s1,s2));
        sc.close();
    }
}
