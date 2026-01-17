class Student {
    public int roll_no;
    protected String name;
    private double cgpa;

    Student(int roll_no, String name, double cgpa){
        this.roll_no = roll_no;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void changeCgpa(double newCgpa){
        this.cgpa=newCgpa;
        System.out.println("CGPA after modification: "+cgpa);
    }
    public double getCgpa(){
        return cgpa;
    }
    public static void main(String[] args){
        Student s1 = new Student(101, "Alice", 8.5);
        System.out.println(s1.getCgpa());
        s1.changeCgpa(8.7);

        PostgraduateStudent p1=new PostgraduateStudent(101, "Alice", 8.5,"AI");
        p1.displayDetails();

        p1.changeCgpa(9.5);
        p1.displayDetails();
    }

}
class PostgraduateStudent extends Student{
    String researchTopic;
    PostgraduateStudent(int roll_no, String name, double cgpa,String topic){
        super(roll_no,name,cgpa);
        this.researchTopic=topic;
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Research topic: "+researchTopic);
        System.out.println("CGPA: "+getCgpa());
    }
}
