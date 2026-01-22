import java.util.*;
class Faculty{
    String facultyName;
    String facultyId;
    Faculty(String facultyName, String facultyId){
        this.facultyName=facultyName;
        this.facultyId=facultyId;
    }

    void displayFaculty(){
        System.out.println(facultyName+"("+facultyId+")");
    }
}
class Departments{
    String deptID;
    String deptName;
    ArrayList<Faculty> list=new ArrayList<>();

    Departments( String deptID,String deptName){
        this.deptID=deptID;
        this.deptName=deptName;
        list=new ArrayList<>();
    }
    void addFaculty(Faculty f){
        list.add(f);
    }
    void showFaculty(){
        System.out.println("Department: "+ deptName);
        for(Faculty f:list){
            f.displayFaculty();
        }
    }
}

class University {
    ArrayList<Departments> list=new ArrayList<>();

    University(){
        list.add(new Departments("D102", "Economics"));
        list.add(new Departments("D157", "Maths"));
    }

    void showDepartments(){
        System.out.println("Departments: \n");
        for(Departments d:list){
            d.showFaculty();
            System.out.println();
        }
    }

    void deleteUniversity() {
        list.clear();
        System.out.println("University deleted. All departments removed.");
    }
    public static void main(String[] args){
        Faculty f1 = new Faculty("asw", "f523");
        Faculty f2 = new Faculty("pln", "f896");

        University u1 = new University();

        u1.list.get(0).addFaculty(f1);
        u1.list.get(0).addFaculty(f2);
        u1.list.get(1).addFaculty(f1); 

        u1.showDepartments();

        u1.deleteUniversity();

        f1.displayFaculty();
        f2.displayFaculty();
    }
}
