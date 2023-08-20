import CentralOnlineSystemClasses.*;
import NotificationSystemClasses.NotificationSystem;
import NotificationSystemClasses.Subscriber;
import NotificationSystemClasses.SubscriberClient;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args){
        //Demo for first three points
        System.out.print("Press enter to see Demo for First 3 points : ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        SCC scc = new FordAsia();
        Car car = scc.orderCar(CarType.RACING,BudgetType.LOW,CarColor.BLACK);
        System.out.println("Total cost of the car is : " + car.cost());
        System.out.println(car.getDescription());

        car = new ThickRainShield(car);
        System.out.println("Total cost of the car is : " + car.cost());
        System.out.println(car.getDescription());

        car = new TightBumper(car);
        System.out.println("Total cost of the car is : " + car.cost());
        System.out.println(car.getDescription());

        car = new MobileBasedControlSystem(car);
        System.out.println("Total cost of the car is : " + car.cost());
        System.out.println(car.getDescription());

        car = new OpenRoofSystem(car);
        System.out.println("Total cost of the car is : " + car.cost());
        System.out.println(car.getDescription());
        System.out.println();

        //Demo for notification system
        System.out.print("Press enter to see Demo for notification system : ");
        scanner.nextLine();
        NotificationSystem notificationSystem = NotificationSystem.getInstance();

        Subscriber subscriber1 = new SubscriberClient("Messi");
        Subscriber subscriber2 = new SubscriberClient("Ronaldo");
        Subscriber subscriber3 = new SubscriberClient("Neymar");

        subscriber1.requestForSubscription();
        subscriber2.requestForSubscription();
        subscriber3.requestForSubscription();

        notificationSystem.priceChange();

        subscriber2.requestForSubscriptionRemoval();

        notificationSystem.basicFeaturesChange();
        System.out.println();

        // Central Online System
        System.out.print("Press enter to see Demo for Central Online system and Mobile App Integration: ");
        scanner.nextLine();
        CentralOnlineSystem system = CentralOnlineSystem.getInstance();
        Command carServicingCommand = new CarServicingCommand("Shamik");
        Command carWashingCommand = new CarWashingCommand("Saima", "Home");
        Command onlineDeliveryCommand = new OnlineDeliveryCommand("Mark", 10000.0);

        system.addCommand(carServicingCommand);
        system.addCommand(carWashingCommand);
        system.addCommand(onlineDeliveryCommand);
        System.out.println();

        // Mobile App Integration
        CentralOnlineSystem webSystem = CentralOnlineSystem.getInstance();
        MobileAppAdapter adapter = new WebSystemAdapter(webSystem);
        adapter.requestCarServicing("shamik");
        adapter.requestCarWashing("Saima", "Home");
        adapter.requestOnlineDelivery("Mark", 10000.0);


    }
}
