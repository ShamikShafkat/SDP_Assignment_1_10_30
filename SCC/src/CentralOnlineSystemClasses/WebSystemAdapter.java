package CentralOnlineSystemClasses;

public class WebSystemAdapter implements MobileAppAdapter {
    private CentralOnlineSystem webSystem;

    public WebSystemAdapter(CentralOnlineSystem webSystem) {
        this.webSystem = webSystem;
    }

    @Override
    public void requestCarServicing(String ownerName,String date) {
        Command carServicingCommand = new CarServicingCommand(ownerName,date);
        webSystem.addCommand(carServicingCommand);
    }

    @Override
    public void requestCarWashing(String ownerName, String desiredPlace,String date) {
        Command carWashingCommand = new CarWashingCommand(ownerName, desiredPlace,date);
        webSystem.addCommand(carWashingCommand);
    }

    @Override
    public void requestOnlineDelivery(String clientName, double paymentAmount,String date) {
        Command onlineDeliveryCommand = new OnlineDeliveryCommand(clientName, paymentAmount,date);
        webSystem.addCommand(onlineDeliveryCommand);
    }
}

