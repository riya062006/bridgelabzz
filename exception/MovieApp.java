import java.util.*;

class InvalidSeatException extends Exception { public InvalidSeatException(String msg){ super(msg); } }
class SeatAlreadyBookedException extends Exception { public SeatAlreadyBookedException(String msg){ super(msg); } }

class BookingSystem {
    private Map<Integer, Boolean> seats = new HashMap<>();

    public BookingSystem() {
        for (int i = 1; i <= 5; i++) seats.put(i, false);
    }

    public void bookSeat(int seatNo)
            throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo))
            throw new InvalidSeatException("Seat " + seatNo + " doesn’t exist!");
        if (seats.get(seatNo))
            throw new SeatAlreadyBookedException("Seat already booked!");
        seats.put(seatNo, true);
        System.out.println("Seat " + seatNo + " booked successfully!");
    }
}

public class MovieApp {
    public static void main(String[] args) {
        BookingSystem b = new BookingSystem();
        try {
            b.bookSeat(1);
            b.bookSeat(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

