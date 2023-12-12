package com.observer.pattern.observable;

import com.observer.pattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver notificationAlertObserver);
    void remove(NotificationAlertObserver notificationAlertObserver);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
