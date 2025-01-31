package org.dpj.decorator;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        notifier = new SMSDecorator(notifier);
        notifier = new FacebookDecorator(notifier);
        notifier = new SlackDecorator(notifier);
        notifier.notify("Hello World");

    }
}
