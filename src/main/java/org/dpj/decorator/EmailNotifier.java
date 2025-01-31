package org.dpj.decorator;

public class EmailNotifier implements Notifier {
    @Override
    public void notify(String message) {
        System.out.println("Sending message: " + message);
    }
}
