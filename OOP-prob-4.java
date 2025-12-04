public class MovieTicket {
    // Private fields for the movie name, seat number, and booking status
    private String movieName;
    private String seatNumber;
    private boolean isBooked;
    // Constructor to initialize the movie name and seat number, booking status is set to false by default
    public MovieTicket(String movieName, String seatNumber) 
    {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.isBooked = false; // Default status is not booked
    }
    // Method to book the ticket if it's not already booked
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked for " + movieName + " at seat " + seatNumber + ".");
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    // Method to cancel the ticket if it is currently booked
    public void cancelTicket() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Booking canceled for seat " + seatNumber + ".");
        } else {
            System.out.println("Seat " + seatNumber + " is not booked yet.");
        }
    }

    // Method to display ticket information and current booking status
    public void displayTicketInfo()
    {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) 
     {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame", "A10"); // Create a new movie ticket
        ticket1.displayTicketInfo(); // Before booking
        ticket1.bookTicket();        // Book the ticket
        ticket1.displayTicketInfo(); // After booking
        ticket1.cancelTicket();      // Cancel the ticket
        ticket1.displayTicketInfo(); // After cancellation
    }
}
