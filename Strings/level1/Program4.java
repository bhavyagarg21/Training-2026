
public class Program4 {
     public static void main(String[] args){
        String text=null;
        try{
            System.out.println(text.charAt(0));
        }
        catch(NullPointerException e){
             System.out.println("Null pointer exception handled");
        }
     }
}
