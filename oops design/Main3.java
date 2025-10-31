import java.util.*;

class Course {
    String courseName;
    List<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students)
            System.out.println("- " + s.name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this); // maintain two-way association
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses)
            System.out.println("- " + c.courseName);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("School: " + name + " has students:");
        for (Student s : students)
            System.out.println("- " + s.name);
    }
}

public class Main3 {
    public static void main(String[] args) {
        School school = new School("Springdale High");

        Student s1 = new Student("Riya");
        Student s2 = new Student("Amit");

        Course c1 = new Course("Maths");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c2);

        school.showStudents();
        s1.showCourses();
        s2.showCourses();
        c2.showStudents();
    }
}
