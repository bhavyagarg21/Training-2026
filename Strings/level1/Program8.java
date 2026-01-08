import java.util.*;

public class Program8 {
    public static String generateException(String[] s){
        return s[s.length];
    }
    public static void handleException(String[] s){
        try{
            System.out.println(s[s.length]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        catch(RuntimeException e) {
            System.out.println("Other RuntimeException handled: " + e.getMessage());
}

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
       // System.out.println(generateException(arr));
        handleException(arr);
        sc.close();
    }

}
