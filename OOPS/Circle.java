import java.util.*;
public class Circle {
        double radius;
        Circle(double r){
            radius=r;
        }
        double calculateArea(){
            return 3.14*radius*radius;
        }
        double calculateCircumference(){
            return 2*3.14*radius;
        }

        void display(){
            System.out.println("Area: "+ calculateArea());
            System.out.println("Circumference: "+ calculateCircumference());
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter radius: ");
            double r=sc.nextDouble();

            Circle c1=new Circle(r);
            c1.display();
            sc.close();
        }
    }

