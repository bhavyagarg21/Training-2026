import java.util.*;
public class Program2 {
    public static int findLength(String s){
        char[] arr=s.toCharArray();
        int cnt=0;
        for(char c:arr) cnt++;
        return cnt;
    }
    public static int countWords(String s){
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') cnt++;
        }
        return cnt;
    }

    public static String[] indexSpace(String s,int n){
        int[] a=new int[n];
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                a[j]=i;
                j++;
            } 
        }
        String[] st=new String[n+1];
        int start=0;
        for(int i=0;i<n;i++){
            st[i]=s.substring(start,a[i]);
            start=1+a[i];
        }
        st[n]=s.substring(start);
        return st;
    }
    public static boolean compare(String[] arr1,String[] arr2){
        if(arr1.length!=arr2.length) return false;
        for(int i=0;i<arr1.length;i++){
            if(!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text:");
        String s=sc.nextLine();
        System.out.println("the length of the text is "+findLength(s));

        int n=countWords(s)+1;
        String[] splitArr=indexSpace(s,n-1);
        String[] tempArr=s.split(" ");
        if (compare(splitArr, tempArr)) {
            System.out.println("Both split methods give SAME result");
        } else {
            System.out.println("Split results are DIFFERENT");
        }

        sc.close();


    }
    
}
