class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket(String movie, int seat, double cost) {
        this.movieName = movie;
        this.seatNumber = seat;
        this.price = cost;
        System.out.println("Ticket Booked Successfully!");
    }

    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("", 0, 0);
        ticket.bookTicket("Avengers: Secret Wars", 21, 350);
        ticket.displayTicket();
    }
}
