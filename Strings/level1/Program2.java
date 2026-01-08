import java.util.*;
public class Program2{
    public static String stringMethod(String s1, int st, int end){
        StringBuilder sb=new StringBuilder();
        for(int i=st;i<end;i++){
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }
    public static boolean checkIfEqual(String s1, String s2){
        int i=0,j=0;
        int m=s1.length();
        int n=s2.length();
        if(m!=n) return false;
        while(i<m && j<n){
            if(s1.charAt(i)!=s2.charAt(j)) return false;
            i++;
            j++;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1=sc.next();
        System.out.println("Enter the starting index: ");
        int st=sc.nextInt();
        System.out.println("Enter the ending index: ");
        int end=sc.nextInt();
        String res1=stringMethod(s1, st, end);

        String res2=s1.substring(st,end);

        boolean res=checkIfEqual(res1,res2);

        if(res==true) System.out.println("Both display the same results");
        else System.out.println("Both display different results");
        sc.close();
    }
} 

