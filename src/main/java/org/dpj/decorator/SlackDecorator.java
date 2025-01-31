package org.dpj.decorator;

public class SlackDecorator extends BaseDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        System.out.println("Sending Slack notification: " + message);
    }
}
