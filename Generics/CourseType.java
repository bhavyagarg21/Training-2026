import java.util.*;

abstract class CourseType {
    abstract String evaluationType();
}

class ExamCourse extends CourseType {
    public String evaluationType() {
        return "Exam Based";
    }
}

class AssignmentCourse extends CourseType {
    public String evaluationType() {
        return "Assignment Based";
    }
}

class ResearchCourse extends CourseType {
    public String evaluationType() {
        return "Research Based";
    }
}

class Course<T extends CourseType> {
    String courseName;
    T courseType;

    Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    void display() {
        System.out.println(courseName + " - " + courseType.evaluationType());
    }

    static void showCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.evaluationType());
        }
    }

    public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", new ExamCourse());

        Course<AssignmentCourse> cs =
                new Course<>("Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd =
                new Course<>("PhD Research", new ResearchCourse());

        math.display();
        cs.display();
        phd.display();

        List<ExamCourse> examCourses = new ArrayList<>();
        examCourses.add(new ExamCourse());

        List<ResearchCourse> researchCourses = new ArrayList<>();
        researchCourses.add(new ResearchCourse());

        showCourses(examCourses);
        showCourses(researchCourses);
    }
}
