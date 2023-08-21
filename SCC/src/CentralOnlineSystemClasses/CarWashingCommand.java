package CentralOnlineSystemClasses;
import java.time.LocalDate;

public class CarWashingCommand implements Command {
//    private String ownerName;
//    private String desiredPlace;
//
//    public CarWashingCommand(String ownerName, String desiredPlace) {
//        this.ownerName = ownerName;
//        this.desiredPlace = desiredPlace;
//    }

    private String ownerName;
    private String desiredPlace;
    private LocalDate bookingDate;
    private boolean isApproved;
    public CarWashingCommand(String ownerName, String desiredPlace, LocalDate bookingDate, boolean isApproved) {
        this.ownerName = ownerName;
        this.desiredPlace = desiredPlace;
        this.bookingDate = bookingDate;
        this.isApproved = isApproved;
    }

    @Override
    public void execute() {
//        System.out.println("Booking car wash for owner: " + ownerName + " at " + desiredPlace + " on " + bookingDate);


        if (isApproved) {
            System.out.println("Booking approved. Car wash scheduled for " + bookingDate);
            System.out.println("Your car wash booking on " + bookingDate + " has been approved.");
            System.out.println("Booking car wash for owner: " + ownerName + " at " + desiredPlace + " on " + bookingDate);
            System.out.println();

        } else {
            System.out.println("Booking not approved. Please choose another date.");
            System.out.println("Your car wash booking on " + bookingDate + " was not approved. Please choose another date.");
        }
    }
}

