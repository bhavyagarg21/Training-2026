import java.util.ArrayList;

class Employee{
    String empName;
    String empId;
    Employee(String empName,String empId){
        this.empId=empId;
        this.empName=empName;
    }

    void displayEmp(){
        System.out.println(empName + " (" + empId + ")");
    }
}

class Department{
    String deptName;
    String deptId;
    ArrayList<Employee> list=new ArrayList<>();
    Department(String deptName,String deptId){
        this.deptName=deptName;
        this.deptId=deptId;

        if(deptName.equals("Finance")){
        list.add(new Employee("abc","F101"));
        list.add(new Employee("xyz","F102"));
        }
        else if(deptName.equals("HR")){
        list.add(new Employee("Carol","H201"));
        list.add(new Employee("Dave","H202"));
        }
    }
    void displayDepartment(){
        System.out.println("Department: "+deptName+"("+deptId+")");
        for(Employee e:list){
            e.displayEmp();
        }
    }
}

class Company {
    ArrayList<Department> list=new ArrayList<>();
    Company(){
        list.add(new Department("Finance","F1063"));
        list.add(new Department("HR", "H812"));
    }
    void displayCompany(){
        for(Department d:list){
            d.displayDepartment();
            System.out.println();
        }
    }
    public static void main(String[] args){
        Company c1=new Company();
        c1.displayCompany();

        Employee e1=new Employee("test", "e101");
        e1.displayEmp();

    }
}
