package org.dpj.decorator.web_system_example.modern_approach;

import org.dpj.decorator.web_system_example.ConcreteRequest;

public class RequestProcessors {
    void loggingProcessor(ConcreteRequest request) {
        System.out.println("Logging request: " + request);
    }

    void validationProcessor(ConcreteRequest request) throws IllegalAccessException {
        if (isRequestInvalid(request)) {
            throw new IllegalAccessException("Missing Authorization header");
        }
    }

    void baseProcessor(ConcreteRequest request) throws IllegalAccessException {
        System.out.println("Processing request: " + request.ip());
    }

    private boolean isRequestInvalid(ConcreteRequest request) {
        return request.headers() == null || !request.headers().containsKey("Authorization");
    }
}
