
import java.util.*;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // abstract salary calculation
    public abstract double calculateSalary();

    // concrete display
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base: " + baseSalary + ", Total Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double allowance;

    public FullTimeEmployee(int id, String name, double base, double allowance) {
        super(id, name, base);
        this.allowance = allowance;
    }

    public double getAllowance() { return allowance; }
    public void setAllowance(double allowance) { this.allowance = allowance; }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + allowance; // simple model
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(int id, String name, double base, int hoursWorked, double ratePerHour) {
        super(id, name, base);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public void setHoursWorked(int h) { this.hoursWorked = h; }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + hoursWorked * ratePerHour;
    }
}

// Department interface
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

class HRDepartment implements Department {
    private String deptName;

    @Override
    public void assignDepartment(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + deptName;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1, "Riya", 50000, 8000));
        employees.add(new PartTimeEmployee(2, "Aman", 10000, 120, 150));

        // Show polymorphic processing
        for (Employee e : employees) e.displayDetails();

        // department example
        HRDepartment hr = new HRDepartment();
        hr.assignDepartment("Human Resources");
        System.out.println(hr.getDepartmentDetails());
    }
}
