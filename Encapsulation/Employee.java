import java.util.*;
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}
abstract class Employee{
    private int employeeId;
    private String name;
    protected double baseSalary;

    Employee(int employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    abstract double calculateSalary();
    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
    public static void main(String[] args){
        Employee e1=new FullTimeEmployee(101,"abc",15000,3000);
        Employee e2=new PartTimeEmployee(105,"xyz",5,3000);
        ArrayList<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        for(Employee e: list){
            e.displayDetails();
        }
    }
}
class FullTimeEmployee extends Employee implements Department{
    private double bonus;
    private String department;

    FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}