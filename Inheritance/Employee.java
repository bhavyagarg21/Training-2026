public class Employee {
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args){
        Employee e1 = new Manager("Amit", 101, 70000, 5);
        Employee e2 = new Developer("Neha", 102, 60000, "Java");
        Employee e3 = new Intern("Ravi", 103, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,double salary,int teamSize){
        super(name, id, salary);
        this.teamSize=teamSize;
    }
    @Override
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Team size: "+teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name,int id,double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Programming language: "+programmingLanguage);
    }
}
class Intern extends Employee{
    int internship_duration;
    Intern(String name,int id,double salary, int internship_duration){
        super(name, id, salary);
        this.internship_duration=internship_duration;
    }
    @Override
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Duration of internship: "+internship_duration);
    }
}