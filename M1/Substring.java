import java.util.*;
public class Substring {
    public static String checkIfContains(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        if(n>m) return "no";

        for(int i=0;i<m;i++){
            int j=0;
            while(j<n && s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            if(j==n) return "yes";
        }
        return "no";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(checkIfContains(s1,s2));
        sc.close();
    }
}
