import java.util.*;
class Program1{
    public static boolean stringMethod(String s1,String s2, int m, int n){
        int i=0,j=0;
        if(m!=n) return false;
        while(i<m && j<n){
            if(s1.charAt(i)!=s2.charAt(j)) return false;
            i++;
            j++;
        }
        return true;
    }
    public static boolean inBuiltMethod(String s1,String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1=sc.nextLine();
        System.out.println("Enter second string: ");
        String s2=sc.nextLine();
        
        int m=s1.length();
        int n=s2.length();
        boolean res1=stringMethod(s1, s2, m, n);
        boolean res2=inBuiltMethod(s1, s2);

        if(res1==res2) System.out.println("Both display the same results");
        else System.out.println("Both display different results");
        sc.close();
    }
}