import java.util.*;
public class CipherText {
    public static String cipher(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a') sb.append('x');
            else if(ch=='b')  sb.append('y');
            else if(ch=='c') sb.append('z');
            else sb.append((char)(ch-3));   
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(cipher(s));
        sc.close();
    }
}
