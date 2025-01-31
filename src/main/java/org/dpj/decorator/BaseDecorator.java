package org.dpj.decorator;

public abstract class BaseDecorator implements Notifier {
    protected final Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notify(String message) {
        notifier.notify(message);
    };
}
