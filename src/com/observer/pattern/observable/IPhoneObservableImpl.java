package com.observer.pattern.observable;

import com.observer.pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StocksObservable {
    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer: observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0) {
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
