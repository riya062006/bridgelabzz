public class PennDistributio {
    public static void main(String[] args) {
        int totalPens = 14, numStudents = 3;
        int pensPerStudent = totalPens / numStudents;
        int remainingPens = totalPens % numStudents;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
