import java.io.IOException;

class InvalidStudentException extends Exception {
    public InvalidStudentException(String msg) { super(msg); }
}

class ExamSystem {
    public void validateStudent(String name) throws InvalidStudentException {
        if (!"Riya".equals(name))
            throw new InvalidStudentException("Student not registered!");
    }

    public void submitExam(String name) throws InvalidStudentException, IOException {
        validateStudent(name);
        // Simulate file upload issue
        throw new IOException("File upload failed!");
    }
}

public class OnlineExam {
    public static void main(String[] args) {
        ExamSystem exam = new ExamSystem();
        try {
            exam.submitExam("Diya");
        } catch (InvalidStudentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
