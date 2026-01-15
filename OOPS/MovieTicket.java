import java.util.*;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0;  
        this.price = 0.0;
    }

    void bookTicket(int seatNumber, double price) {
        if (seatNumber <= 0 || price <= 0) {
            System.out.println("Invalid seat number or price");
            return;
        }
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully");
    }

    void displayTicketDetails() {
        if (seatNumber == 0) {
            System.out.println("Ticket not booked yet");
        } else {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: " + price);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        MovieTicket ticket = new MovieTicket(movieName);

        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(seat, price);
        ticket.displayTicketDetails();

        sc.close();
    }
}
