package org.dpj.observer;

import java.util.ArrayList;
import java.util.List;

/*
    notifica os observadores quando novo produto estiver disponivel
    mantem uma lista de observadores

 */
public class Store {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String productName;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(productName);
        }
    }

    public void addProduct(String productName) {
        this.productName = productName;
        System.out.println("New product added: " + productName);
        notifySubscribers();
    }
}
