package NotificationSystemClasses;

public interface Subscriber {
    public void update(String message);
    public void requestForSubscription();
    public void requestForSubscriptionRemoval();
}

class SubscriberClient implements Subscriber{
    String name;
    NotificationSystem notificationSystem;

    public SubscriberClient(String name){
        this.name = name;
        this.notificationSystem = NotificationSystem.getInstance();
    }

    @Override
    public void update(String message) {
        System.out.println("Hello " + this.name + " ,we have an update for you");
        System.out.println(message);
    }

    @Override
    public void requestForSubscription() {
        notificationSystem.registerSubscriber(this);
    }

    @Override
    public void requestForSubscriptionRemoval() {
        notificationSystem.removeSubscriber(this);
    }
}