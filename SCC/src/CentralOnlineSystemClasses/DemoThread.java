package CentralOnlineSystemClasses;

public class DemoThread implements Runnable{
    @Override
    public void run() {
        CentralOnlineSystem system = CentralOnlineSystem.getInstance();
        Command carServicingCommand = new CarServicingCommand("Shamik","21/08/2023");
        Command carWashingCommand = new CarWashingCommand("Saima", "Home","21/08/2023");
        Command onlineDeliveryCommand = new OnlineDeliveryCommand("Mark", 10000.0,"21/08/2023");
        Command carWashingCommand2 = new CarWashingCommand("Shamik", "Shop","22/08/2023");

        system.addCommand(carServicingCommand);
        system.addCommand(carWashingCommand);
        system.addCommand(onlineDeliveryCommand);
        system.addCommand(carWashingCommand2);
    }
}
