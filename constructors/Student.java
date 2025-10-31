class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int roll, String n, double c) {
        rollNumber = roll;
        name = n;
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int roll, String n, double c, String s) {
        super(roll, n, c);
        specialization = s;
    }

    void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", Specialization: " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent s1 = new PostgraduateStudent(1, "Riya", 9.1, "AI");
        s1.display();
        System.out.println("CGPA: " + s1.getCGPA());
    }
}

