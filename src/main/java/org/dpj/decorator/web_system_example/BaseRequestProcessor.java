package org.dpj.decorator.web_system_example;

public class BaseRequestProcessor implements RequestProcessor {
    @Override
    public void process(ConcreteRequest request) {
        System.out.println("Request processed: " + request.ip());
    }
}
