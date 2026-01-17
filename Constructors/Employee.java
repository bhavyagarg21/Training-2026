class Employee {
    public int employeeID;        
    protected String department;  
    private double salary;        

    Employee(int employeeID, String department, double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0) {
            salary = newSalary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }

    public double getSalary(){
        return salary;
    }

    public void displayEmployeeInfo(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args){
        Employee e1 = new Employee(101, "HR", 50000);
        e1.displayEmployeeInfo();

        System.out.println();

        Manager m1 = new Manager(201, "IT", 80000);
        m1.displayManagerInfo();
        
        m1.setSalary(85000);
        System.out.println("\nAfter salary update:");
        m1.displayManagerInfo();
    }
}

class Manager extends Employee {

    Manager(int employeeID, String department, double salary){
        super(employeeID, department, salary);
    }

    void displayManagerInfo(){
        System.out.println("Manager ID: " + employeeID);       
        System.out.println("Department: " + department);       
        System.out.println("Salary: " + getSalary());          
    }
}
