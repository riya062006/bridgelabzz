import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of Physics, Chemistry, Maths for student " + (i + 1) + ":");
            int p = sc.nextInt(), c = sc.nextInt(), m = sc.nextInt();
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks! Enter again.");
                i--; 
                continue;
            }
            phy[i] = p; chem[i] = c; math[i] = m;

            percentage[i] = (p + c + m) / 3.0;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Phy=" + phy[i] + ", Chem=" + chem[i] +
                    ", Math=" + math[i] + ", %=" + percentage[i] + ", Grade=" + grade[i]);
        }
    }
}
