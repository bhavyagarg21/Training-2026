public class Student {
    final int rollNumber;
    String name;
    char grade;

    static String universityName = "ABC";

    static int totalStudents = 0;

    Student(String name, int rollNumber, char grade) {
        this.name = name;         
        this.rollNumber = rollNumber; 
        this.grade = grade;

        totalStudents++;          
    }

    static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Not a Student object");
        }
    }

    void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        } else {
            System.out.println("Cannot update grade, not a Student object");
        }
    }

    public static void main(String[] args) {
        Student s2 = new Student("Bob", 102, 'B');

        s2.displayDetails();

        s2.updateGrade('A');
        s2.displayDetails();

        Student.displayTotalStudents();
    }
}
