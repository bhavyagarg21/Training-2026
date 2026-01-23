import java.util.*;
public class Anagrams {
    public static boolean checkAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int[] hash=new int[26];
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        for(int i=0;i<s1.length();i++){
            hash[s1.charAt(i)-'a']++;
            hash[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<s1.length();i++){
            if(hash[i]!=0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1=sc.nextLine();
        System.out.println("Enter seocnd string: ");
        String s2=sc.nextLine();
        if(checkAnagram(s1,s2)) System.out.println("Strings are anagrams");
        else System.out.println("Strings are not anagrams");
        sc.close();
    }
}
