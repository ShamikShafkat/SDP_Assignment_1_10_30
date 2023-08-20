package NotificationSystemClasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public interface NotificationSubject {
    public void registerSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscribersForPriceChange();
    public void notifySubscriberForCarFeatureChange();
}

