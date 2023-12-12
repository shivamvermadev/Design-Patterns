package com.observer.pattern.observer;

import com.observer.pattern.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    private String userName;
    private StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "Product is in stock");
    }

    private void sendMessageOnMobile(String userName, String message) {
        System.out.println("Message sent to " + userName + " " + message);
    }
}
