import java.util.Scanner;

public class Program7 {
    public static int generateException(String s){
        return Integer.parseInt(s);
    }
    public static void handleException(String s){
        try{
            System.out.println(Integer.parseInt(s));
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException handled");
        }
        catch(RuntimeException e) {
            System.out.println("Other RuntimeException handled: " + e.getMessage());
}

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();
        sc.close();
        //System.out.println(generateException(s));
        handleException(s);
    }

}
