package org.dpj.decorator.web_system_example.modern_approach;

import org.dpj.decorator.web_system_example.ConcreteRequest;

@FunctionalInterface
public interface RequestProcessor {
    void process(ConcreteRequest request) throws IllegalAccessException;

    default RequestProcessor then(RequestProcessor next) {
        return request -> {
            this.process(request);
            next.process(request);
        };
    }
}
