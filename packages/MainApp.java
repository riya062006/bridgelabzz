import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Riya", 101);
        Faculty f = new Faculty("Mr. Sharma", "Computer Science");

        s.displayDetails();
        f.displayDetails();
    }
}

