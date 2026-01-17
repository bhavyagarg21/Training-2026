import java.util.*;
public class Circle {
    double radius;
    Circle(){
        this(0.0);
    }
    Circle(double r){
        this.radius=r;
    }
    public static void main(String[] args){
        Circle c1=new Circle();
        System.out.println(c1.radius);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r=sc.nextDouble();
        
        Circle c2=new Circle(r);
        System.out.println(c2.radius);
        sc.close();
    }
}
