package com.observer.pattern;

import com.observer.pattern.observable.IPhoneObservableImpl;
import com.observer.pattern.observable.StocksObservable;
import com.observer.pattern.observer.EmailAlertObserverImpl;
import com.observer.pattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc1@gmail.com",iphoneStockObservable);

        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc1@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("xyz_username",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
