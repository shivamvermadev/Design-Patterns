package com.observer.pattern.observer;

import com.observer.pattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    private String emailId;
    private StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is in stock");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("email sent to " + emailId + " " + message);
    }
}