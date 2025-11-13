class InvalidRatingException extends Exception {
    public InvalidRatingException(String msg) { super(msg); }
}

class EmptyReviewException extends Exception {
    public EmptyReviewException(String msg) { super(msg); }
}

class ProductReview {
    public void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {
        if (rating < 1 || rating > 5)
            throw new InvalidRatingException("Rating must be between 1 and 5!");
        if (comment == null || comment.trim().isEmpty())
            throw new EmptyReviewException("Review comment cannot be empty!");
        System.out.println("✅ Review submitted successfully: " + rating + "⭐ — " + comment);
    }
}

public class ReviewApp {
    public static void main(String[] args) {
        ProductReview r = new ProductReview();
        try {
            r.submitReview(6, "Excellent product!");
        } catch (InvalidRatingException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

