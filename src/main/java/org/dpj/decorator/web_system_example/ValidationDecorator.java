package org.dpj.decorator.web_system_example;

public class ValidationDecorator extends RequestProcessDecorator {
    public ValidationDecorator(RequestProcessor processor) {
        super(processor);
    }

    @Override
    public void process(ConcreteRequest request) throws IllegalAccessException {
        if (isRequestInvalid(request)) {
            throw new IllegalAccessException("Missing Authorization header");
        }

        super.process(request);
    }

    private boolean isRequestInvalid(ConcreteRequest request) {
        return request.headers() == null || !request.headers().containsKey("Authorization");
    }

}
