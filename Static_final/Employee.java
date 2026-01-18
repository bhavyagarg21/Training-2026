public class Employee {
    String name;

    final int id;          
    String designation;

    static String companyName = "ABC";
    static int totalEmployees = 0;

    Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;         
        this.designation = designation;
        totalEmployees++;      
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if(this instanceof Employee) {   
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Not an Employee object");
        }
    }


    public static void main(String[] args) {
        System.out.println("Company: " + Employee.companyName);
        Employee emp1 = new Employee("Alice", 101, "Manager");
 
        emp1.displayDetails();
        Employee.displayTotalEmployees();
    }
}
