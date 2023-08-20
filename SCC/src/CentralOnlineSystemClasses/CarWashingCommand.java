package CentralOnlineSystemClasses;

public class CarWashingCommand implements Command {
    private String ownerName;
    private String desiredPlace;

    public CarWashingCommand(String ownerName, String desiredPlace) {
        this.ownerName = ownerName;
        this.desiredPlace = desiredPlace;
    }

    @Override
    public void execute() {
        System.out.println("Washing car for owner: " + ownerName + " at " + desiredPlace);
    }
}

