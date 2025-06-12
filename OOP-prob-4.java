public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private boolean isBooked;

    public MovieTicket(String movieName, String seatNumber) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.isBooked = false; // Default status is not booked
    }

    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked for " + movieName + " at seat " + seatNumber + ".");
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    public void cancelTicket() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Booking canceled for seat " + seatNumber + ".");
        } else {
            System.out.println("Seat " + seatNumber + " is not booked yet.");
        }
    }

    public void displayTicketInfo() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame", "A10");

        ticket1.displayTicketInfo(); // Before booking
        ticket1.bookTicket();
        ticket1.displayTicketInfo(); // After booking
        ticket1.cancelTicket();
        ticket1.displayTicketInfo(); // After cancellation
    }
}
