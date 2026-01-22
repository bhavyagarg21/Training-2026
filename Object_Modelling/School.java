import java.util.ArrayList;
class Course{
    String courseName;
    int courseId;
    ArrayList<Student> list=new ArrayList<>();
    Course(String courseName, int courseId){
        this.courseName=courseName;
        this.courseId=courseId;
    }
}
class Student{
    String name;
    int id;
    ArrayList<Course> list=new ArrayList<>();
    Student(String name,int id){
        this.name=name;
        this.id=id;
        list.add(new Course("java",125));
        list.add(new Course("python",784));
    }
    
}
class School {
    ArrayList<Student> list=new ArrayList<>();
    
}
