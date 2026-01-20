public class Course {
    String courseName;
    int duration;
    Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    void displayDetails(){
        System.out.println("Course: "+courseName);
        System.out.println("Duration: "+duration);
    }
    public static void main(String[] args){
        Course c1 = new OnlineCourse("Java Basics", 6, "Coursera", true);
        Course c2 = new PaidOnlineCourse("Advanced Java", 8, "Udemy", true, 5000, 10);

        c1.displayDetails();
        c2.displayDetails();
    }
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName,int duration,String platform,Boolean isRecorded){
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Platform: "+platform);
        System.out.println("Is it recorded? : "+isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;
    PaidOnlineCourse(String courseName,int duration,String platform,Boolean isRecorded, double fee, double discount){
        super(courseName, duration,platform,isRecorded);
        this.fee=fee;
        this.discount=discount;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Fee: "+fee);
        System.out.println("Discount: "+discount);
    }
}
