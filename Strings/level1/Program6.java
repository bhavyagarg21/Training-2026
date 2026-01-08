import java.util.*;

public class Program6 {
    public static String generateException(String s){
        return s.substring(3,2);
    }
    public static void handleException(String s){
        try{
            System.out.println(s.substring(3,2));
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException handled");
        }
        catch(RuntimeException e) {
            System.out.println("Other RuntimeException handled: " + e.getMessage());
}

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        //System.out.println(generateException(s));
        handleException(s);
        sc.close();
    }
}
