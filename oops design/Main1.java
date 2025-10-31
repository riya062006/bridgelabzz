import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDept() {
        System.out.println("Department: " + name);
        for (Employee e : employees)
            e.show();
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments)
            d.showDept();
    }
}

public class Main1 {
    public static void main(String[] args) {
        Company comp = new Company("TechSoft");

        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Riya"));
        dev.addEmployee(new Employee("Karan"));

        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Anita"));

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showCompany();
    }
}

