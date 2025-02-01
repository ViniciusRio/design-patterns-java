package org.dpj.decorator.web_system_example;

public class LoggingDecorator extends RequestProcessDecorator{
    public LoggingDecorator(RequestProcessor processor) {
        super(processor);
    }

    @Override
    public void process(ConcreteRequest request) throws IllegalAccessException {
        System.out.println("Logging request: " + request);
        super.process(request);
    }

}
