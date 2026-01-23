import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        String s=String.valueOf(n);
        if(isPalindrome(s)) System.out.println("Number is palindrome");
        else System.out.println("Number is not a palindrome");
        sc.close();
    }
}
