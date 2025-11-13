class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String msg) { super(msg); }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) { super(msg); }
}

class FlightBooking {
    public void checkSeatAvailability(boolean available) throws SeatUnavailableException {
        if (!available) throw new SeatUnavailableException("Seats are unavailable!");
    }

    public void processPayment(boolean success) throws PaymentFailedException {
        if (!success) throw new PaymentFailedException("Payment failed!");
    }

    public void bookTicket(boolean seat, boolean payment) throws Exception {
        checkSeatAvailability(seat);
        processPayment(payment);
        System.out.println("Ticket booked successfully!");
    }
}

public class FlightApp {
    public static void main(String[] args) {
        FlightBooking fb = new FlightBooking();
        try {
            fb.bookTicket(true, false);
        } catch (SeatUnavailableException e) {
            System.out.println("Booking Error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Payment Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}

