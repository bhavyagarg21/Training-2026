import java.util.*;

public class Program5 {
    public static int generateException(String s){
        return s.charAt(s.length());
    }
    public static void handleException(String s){
        try{
            System.out.println(s.charAt(s.length()));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException handled");
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
