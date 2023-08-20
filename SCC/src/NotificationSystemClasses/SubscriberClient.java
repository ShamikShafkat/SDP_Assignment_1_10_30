package NotificationSystemClasses;

public class SubscriberClient implements Subscriber {
    private final String name;

    public SubscriberClient(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void update(String message) {
        System.out.println("Hello " + this.name + " ,we have an update for you");
        System.out.println(message);
    }

    @Override
    public void requestForSubscription() {
        NotificationSystem.getInstance().registerSubscriber(this);
    }

    @Override
    public void requestForSubscriptionRemoval() {
        NotificationSystem.getInstance().removeSubscriber(this);
    }
}
