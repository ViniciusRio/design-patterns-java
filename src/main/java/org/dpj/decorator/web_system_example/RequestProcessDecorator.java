package org.dpj.decorator.web_system_example;

public abstract class RequestProcessDecorator implements RequestProcessor {
    protected final RequestProcessor processor;

    protected RequestProcessDecorator(RequestProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void process(ConcreteRequest request) throws IllegalAccessException {
        processor.process(request);
    }
}
