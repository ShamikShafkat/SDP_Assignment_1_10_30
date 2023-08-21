package CentralOnlineSystemClasses;

import java.time.LocalDate;

public class WebSystemAdapter implements MobileAppAdapter {
    private CentralOnlineSystem webSystem;

    public WebSystemAdapter(CentralOnlineSystem webSystem) {
        this.webSystem = webSystem;
    }

    @Override
    public void requestCarServicing(String ownerName) {
        Command carServicingCommand = new CarServicingCommand(ownerName);
        webSystem.addCommand(carServicingCommand);
    }
//
//    @Override
//    public void requestCarWashing(String ownerName, String desiredPlace) {
//        Command carWashingCommand = new CarWashingCommand(ownerName, desiredPlace);
//        webSystem.addCommand(carWashingCommand);
//    }

    @Override
    public void requestCarWashing(String ownerName, String desiredPlace, LocalDate bookingDate, boolean isApproved) {
        Command carWashBookingCommand = new CarWashingCommand(ownerName, desiredPlace, bookingDate, isApproved);
        webSystem.addCommand(carWashBookingCommand);
    }

    @Override
    public void requestOnlineDelivery(String clientName, double paymentAmount) {
        Command onlineDeliveryCommand = new OnlineDeliveryCommand(clientName, paymentAmount);
        webSystem.addCommand(onlineDeliveryCommand);
    }
}

