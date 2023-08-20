package CentralOnlineSystemClasses;

public class OnlineDeliveryCommand implements Command {
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

