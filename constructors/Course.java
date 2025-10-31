class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Institute";

    Course(String c, int d, double f) {
        courseName = c;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration +
                " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 5000);
        Course c2 = new Course("Python", 4, 6000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Code Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
