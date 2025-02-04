package org.dpj.observer;
/*
    implementa interface comum para receber notificações
    reage a notificações da loja
 */
public class Customer implements Subscriber {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println(name + ": New Product available - " + productName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
