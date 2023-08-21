package CentralOnlineSystemClasses;

public class CarServicingCommand implements Command {
    private String ownerName;
    private String date;


    public CarServicingCommand(String ownerName,String date) {
        this.ownerName = ownerName;
        this.date = date;
    }

    @Override
    public void execute() {
        System.out.println("Servicing car for owner: " + ownerName);
    }

    @Override
    public String getDate() {
        return this.date;
    }
}

