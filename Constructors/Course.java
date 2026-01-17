public class Course {
    String courseName;
    double fee;
    int duration;

    static String instituteName="abc";

    Course(String courseName, double fee,int duration){
        this.courseName=courseName;
        this.fee=fee;
        this.duration=duration;
    }
    void displayCourseDetails(){
        System.out.println("Institute: " + instituteName);
        System.out.println("Course name: "+courseName);
        System.out.println("Fee: "+fee);
        System.out.println("Duration: "+duration);
    }
    static void updateInstituteName(String iName){
        instituteName=iName;
    }
    public static void main(String[] args){
        Course c1 = new Course("Java", 15000, 3);
        Course c2 = new Course("Python", 12000, 2);
        
        c1.displayCourseDetails();
        Course.updateInstituteName("xyz");

        c2.displayCourseDetails();
    }
}
