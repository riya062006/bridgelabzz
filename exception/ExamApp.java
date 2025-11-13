import java.time.LocalDateTime;

class LateSubmissionException extends Exception { public LateSubmissionException(String msg){ super(msg); } }
class InvalidFileFormatException extends Exception { public InvalidFileFormatException(String msg){ super(msg); } }

class ExamPortal {
    LocalDateTime deadline = LocalDateTime.of(2025, 11, 10, 17, 0);

    public void submitExam(String fileName, LocalDateTime time)
            throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("Invalid file format!");
        if (time.isAfter(deadline))
            throw new LateSubmissionException("Submission is late!");
        System.out.println("Submission successful!");
    }
}

public class ExamApp {
    public static void main(String[] args) {
        ExamPortal e = new ExamPortal();
        try {
            e.submitExam("answer.docx", LocalDateTime.now());
        } catch (Exception ex) {
            System.out.println("Submission failed: " + ex.getMessage());
        }
    }
}
