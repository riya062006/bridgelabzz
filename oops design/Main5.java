import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void showFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    void showDept() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String uniName;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String uniName) {
        this.uniName = uniName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showUniversity() {
        System.out.println("University: " + uniName);
        System.out.println("Departments:");
        for (Department d : departments) d.showDept();
        System.out.println("Faculties:");
        for (Faculty f : faculties) f.showFaculty();
    }

    void deleteUniversity() {
        departments.clear();
        System.out.println(uniName + " deleted → All departments removed!");
    }
}

public class Main5 {
    public static void main(String[] args) {
        University uni = new University("Oxford University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");

        Faculty f1 = new Faculty("Dr. Riya");
        Faculty f2 = new Faculty("Prof. Karan");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();
        uni.deleteUniversity();

        // Faculty still exists independently
        f1.showFaculty();
    }
}
