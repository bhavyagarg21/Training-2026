import java.util.*;
public class Student {
    String name;
    int roll_no;
    double marks;
    Student(String name, int roll_no,double marks){
        this.name=name;
        this.roll_no=roll_no;
        this.marks=marks;
    }
    char calculateGrade(){
        if(marks>=90) return 'A';
        else if(marks>=80) return 'B';
        else if(marks>=70) return 'C';
        else if(marks>=60) return 'D';
        return 'F';
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll no: "+ roll_no);
        System.out.println("Marks: "+ marks);
        System.out.println("Grade: "+ calculateGrade());
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name: ");
        String name=sc.nextLine();

        System.out.println("Enter roll no: ");
        int roll_no=sc.nextInt();

        System.out.println("Enter marks: ");
        double marks=sc.nextDouble();

        Student s1=new Student(name, roll_no, marks);
        s1.display();
        sc.close();
    }
}
