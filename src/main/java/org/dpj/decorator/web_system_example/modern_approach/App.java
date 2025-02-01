package org.dpj.decorator.web_system_example.modern_approach;

import org.dpj.decorator.web_system_example.ConcreteRequest;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        RequestProcessors requestProcessors = new RequestProcessors();

        RequestProcessor emptyFunction = f -> {

        };

        var processorPipeline = emptyFunction.then(requestProcessors::loggingProcessor)
                .then(requestProcessors::validationProcessor)
                .then(requestProcessors::baseProcessor);


        Map<String, String> headers = Map.of("Authorization", "Bearer token123");
        ConcreteRequest validRequest = new ConcreteRequest("192.168.1.1", headers);
        ConcreteRequest invalidRequest = new ConcreteRequest("192.168.1.1", null);

        try {
            processorPipeline.process(validRequest);
            processorPipeline.process(invalidRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
