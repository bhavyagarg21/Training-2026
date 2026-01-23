import java.util.*;

class ReverseWords{
    public static void reverse(String[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=new StringBuilder(arr[i]).reverse().toString();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text: ");
        String s=sc.nextLine();

        String[] str=s.split(" ");
        reverse(str);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(str[i]).append(" ");
        }
        s=sb.toString().trim();
        System.out.println(s);
        sc.close();

    }
}