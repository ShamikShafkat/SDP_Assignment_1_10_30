package CentralOnlineSystemClasses;

public interface MobileAppAdapter {
    void requestCarServicing(String ownerName,String date);
    void requestCarWashing(String ownerName, String desiredPlace,String date);
    void requestOnlineDelivery(String clientName, double paymentAmount,String date);
}
