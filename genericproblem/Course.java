import java.util.*;

abstract class CourseType {
    abstract String getType();
}

class ExamCourse extends CourseType {
    String getType() { return "Exam-Based"; }
}

class AssignmentCourse extends CourseType {
    String getType() { return "Assignment-Based"; }
}

class ResearchCourse extends CourseType {
    String getType() { return "Research-Based"; }
}

class Course<T extends CourseType> {
    private String name;
    private T type;

    Course(String name, T type) {
        this.name = name;
        this.type = type;
    }

    public void showCourse() {
        System.out.println(name + " (" + type.getType() + ")");
    }
}

class University {
    public static void showAllCourses(List<? extends CourseType> list) {
        for (CourseType c : list)
            System.out.println(c.getType());
    }

    public static void main(String[] args) {
        Course<ExamCourse> java = new Course<>("Java Programming", new ExamCourse());
        Course<ResearchCourse> ai = new Course<>("AI Research", new ResearchCourse());

        java.showCourse();
        ai.showCourse();
    }
}

