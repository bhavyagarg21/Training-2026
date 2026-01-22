import java.util.*;

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    // Student() {
    // }

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void viewCourses() {
        System.out.println("Courses of " + name);
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}

class SchoolModel {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    SchoolModel(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    public static void main(String[] args) {

        SchoolModel school = new SchoolModel("ABC School");

        Student s1 = new Student("xyz");
        Student s2 = new Student("jkl");

        school.addStudent(s1);
        school.addStudent(s2);

        Course math = new Course("Maths");
        Course science = new Course("Science");

        s1.enroll(math);
        s1.enroll(science);
        s2.enroll(math);

        s1.viewCourses();
        math.showStudents();
    }
}
