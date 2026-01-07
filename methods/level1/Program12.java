package level1;
import java.util.*;
public class Program12 {
    public static double[] calculateTrigonometricFunctions(double angle){
        double angleInRadian=Math.toRadians(angle);
        double sine=Math.sin(angleInRadian);
        double cos=Math.cos(angleInRadian);
        double tan=Math.tan(angleInRadian);
        return new double[]{sine,cos,tan};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the angle:");
        double angle=sc.nextDouble();
        double[] res=calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + res[0]);
        System.out.println("Cosine: " + res[1]);    
        System.out.println("Tangent: " + res[2]);
        sc.close();

    }
}
