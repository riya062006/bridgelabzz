class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String team;

    Manager(int id, String dept, double sal, String t) {
        super(id, dept, sal);
        team = t;
    }

    void display() {
        System.out.println("Manager ID: " + employeeID + ", Dept: " + department + ", Team: " + team);
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 90000, "Dev Team");
        m.display();
        m.setSalary(95000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}
