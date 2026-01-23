import java.util.*;
public class Pangram {
    public static boolean isPangram(String s){
        boolean[] arr=new boolean[26];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z') arr[ch-'a']=true;
        }
        for(boolean i: arr){
            if(!i) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text: ");
        String s=sc.nextLine(); 
        if(isPangram(s)) System.out.println("String is pangram");
        else System.out.println("String is not a pangram");
        sc.close();
    }
}
