package NotificationSystemClasses;

import java.util.HashSet;
import java.util.Set;

public class NotificationSystem implements NotificationSubject {

    private final Set<Subscriber> subscriberSet;
    private volatile static NotificationSystem uniqueInstance;

    private NotificationSystem() {
        subscriberSet = new HashSet<Subscriber>();
    }

    public static NotificationSystem getInstance() {
        if (uniqueInstance == null) {
            synchronized (NotificationSystem.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new NotificationSystem();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    public synchronized void registerSubscriber(Subscriber subscriber) {
        subscriberSet.add(subscriber);
    }

    @Override
    public synchronized void removeSubscriber(Subscriber subscriber) {
        subscriberSet.remove(subscriber);
    }

    @Override
    public void notifySubscribersForPriceChange() {
        for (Subscriber subscriber : subscriberSet) {
            subscriber.update("Some cars price has been changed.Please visit our website to see the changes...");
        }
    }

    @Override
    public void notifySubscriberForCarFeatureChange() {
        for (Subscriber subscriber : subscriberSet) {
            subscriber.update("Some cars basic features has been changed.Please visit our website to see the changes...");
        }
    }

    public void priceChange() {
        notifySubscribersForPriceChange();
    }

    public void basicFeaturesChange() {
        notifySubscriberForCarFeatureChange();
    }
}
