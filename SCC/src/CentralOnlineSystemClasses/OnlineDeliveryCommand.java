package CentralOnlineSystemClasses;

public class OnlineDeliveryCommand implements Command {
    private String clientName;
    private double paymentAmount;
    private String date;

    public OnlineDeliveryCommand(String clientName, double paymentAmount,String date) {
        this.clientName = clientName;
        this.paymentAmount = paymentAmount;
        this.date = date;
    }

    @Override
    public void execute() {
        System.out.println("Processing online delivery for client: " + clientName + " with payment: $" + paymentAmount);
    }

    @Override
    public String getDate() {
        return this.date;
    }

}

