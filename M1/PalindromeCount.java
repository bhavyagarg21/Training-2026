import java.util.*;
public class PalindromeCount {
    public static boolean checkPalindrome(String str){
        int i=0, j=str.length()-1;
        while(i<j){
            char ch1=str.charAt(i);
            char ch2=str.charAt(j);
            if(ch1!=ch2) return false;
            i++;
            j--;
        }
        return true;
    }
    public static int cntPalindrome(String s, int n){
        String[] arr=s.split(" ");
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            if(checkPalindrome(temp)) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(cntPalindrome(s,n));
        sc.close();
    }
}
