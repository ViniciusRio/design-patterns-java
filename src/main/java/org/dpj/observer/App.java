package org.dpj.observer;

public class App {
    public static void main(String[] args) {
        Store store = new Store();

        Customer John = new Customer("John");
        Customer Jane = new Customer("Jane");

        store.subscribe(John);
        store.subscribe(Jane);

        store.addProduct("Iphone 15");

        store.unsubscribe(John);

        store.addProduct("Macbook Pro");

    }
}
