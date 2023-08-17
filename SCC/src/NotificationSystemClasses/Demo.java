package NotificationSystemClasses;

public class Demo {

    public static void main(String[] args){
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

    }
}
