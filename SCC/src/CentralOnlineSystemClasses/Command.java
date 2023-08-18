package CentralOnlineSystemClasses;

public interface Command {
    void execute();
}

class CarServicingCommand implements Command {
    private String ownerName;

    public CarServicingCommand(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void execute() {
        System.out.println("Servicing car for owner: " + ownerName);
    }
}

class CarWashingCommand implements Command {
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

class OnlineDeliveryCommand implements Command {
    private String clientName;
    private double paymentAmount;

    public OnlineDeliveryCommand(String clientName, double paymentAmount) {
        this.clientName = clientName;
        this.paymentAmount = paymentAmount;
    }

    @Override
    public void execute() {
        System.out.println("Processing online delivery for client: " + clientName + " with payment: $" + paymentAmount);
    }
}

