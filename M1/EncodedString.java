import java.util.*;
public class EncodedString {
    public static String encode(String s, int n){
        int cnt=0;
        StringBuilder sb=new StringBuilder();
        int j=0;
        while(j<n){
            char ch=s.charAt(j);
            if(ch=='1') cnt++;
            else{
                char ch1=(char)(64+cnt);
                sb.append(ch1);
                cnt=0;
            }
            j++;
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        System.out.println(encode(s,n));
        sc.close();
    }
}
