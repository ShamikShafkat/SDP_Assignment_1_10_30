package CentralOnlineSystemClasses;

public class CarWashingCommand implements Command {
    private String ownerName;
    private String desiredPlace;
    private String date;

    public CarWashingCommand(String ownerName, String desiredPlace,String date) {
        this.ownerName = ownerName;
        this.desiredPlace = desiredPlace;
        this.date = date;
    }

    @Override
    public void execute() {
        System.out.println("Washing car for owner: " + ownerName + " at " + desiredPlace);
    }

    @Override
    public String getDate() {
        return this.date;
    }
}

