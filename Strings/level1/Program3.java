import java.util.*;
public class Program3{
    public static char[] stringMethod(String s1,int n){
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=s1.charAt(i);
        }
        return arr;
    }
    public static char[] inBuiltMethod(String s1){
        char[] arr=s1.toCharArray();
        return arr;
    }

    public static boolean compare(char[] arr1,char[] arr2){
        if(arr1.length!=arr2.length) return false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1=sc.next();
        int n=s1.length();

        char[] res1=stringMethod(s1,n);

        char[] res2=inBuiltMethod(s1);

        boolean res=compare(res1,res2);
        if (res)
            System.out.println("Both display the same results");
        else
            System.out.println("Both display different results");
        
        sc.close();
    }
} 

