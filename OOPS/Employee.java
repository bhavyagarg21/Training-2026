import java.util.*;
class Employee{
    String name;
    int id;
    double salary;
    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("The name is "+name);
        System.out.println("The id is "+id);
        System.out.println("The salary is "+salary);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name: ");
        String name=sc.nextLine();

        System.out.println("Enter id: ");
        int id=sc.nextInt();

        System.out.println("Enter salary: ");
        double salary=sc.nextDouble();

        Employee e1=new Employee(id,name,salary);
        e1.display();
        sc.close();
    }
}