package CentralOnlineSystemClasses;

public class CarServicingCommand implements Command {
    private String ownerName;

    public CarServicingCommand(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void execute() {
        System.out.println("Servicing car for owner: " + ownerName);
    }
}

