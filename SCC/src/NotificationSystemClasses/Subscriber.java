package NotificationSystemClasses;

public interface Subscriber {
    public void update(String message);
    public void requestForSubscription();
    public void requestForSubscriptionRemoval();
}

