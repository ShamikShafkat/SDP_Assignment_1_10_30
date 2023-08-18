package CentralOnlineSystemClasses;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Demo for point 5: ");
        CentralOnlineSystem system = CentralOnlineSystem.getInstance();
        Command carServicingCommand = new CarServicingCommand("Shamik");
        Command carWashingCommand = new CarWashingCommand("Saima", "Home");
        Command onlineDeliveryCommand = new OnlineDeliveryCommand("Mark", 10000.0);

        system.addCommand(carServicingCommand);
        system.addCommand(carWashingCommand);
        system.addCommand(onlineDeliveryCommand);


//        System.out.println("Demo for point 6: ");
//        CentralOnlineSystem webSystem = CentralOnlineSystem.getInstance();
//        MobileAppAdapter adapter = new WebSystemAdapter(webSystem);
//        adapter.requestCarServicing("shamik");
//        adapter.requestCarWashing("Saima", "Home");
//        adapter.requestOnlineDelivery("Mark", 10000.0);
    }
}
