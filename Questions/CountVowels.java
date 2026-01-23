import java.util.*;
class CountVowels{
    public static int countVowels(String s){
        int cnt=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' 
            || s.charAt(i)=='i' || s.charAt(i)=='o' 
            || s.charAt(i)=='u') cnt++;
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text: ");
        String s=sc.nextLine();
        System.out.println(countVowels(s));
        sc.close();
    }
}