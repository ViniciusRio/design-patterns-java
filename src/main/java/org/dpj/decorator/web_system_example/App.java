package org.dpj.decorator.web_system_example;



import com.sun.net.httpserver.Request;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        RequestProcessor baseRequestProcessor = new BaseRequestProcessor();

        RequestProcessor validationProcessor = new ValidationDecorator(baseRequestProcessor);
        RequestProcessor loggingProcessor = new LoggingDecorator(validationProcessor);


        Map<String, String> headers = Map.of("Authorization", "Bearer token123");
        ConcreteRequest validRequest = new ConcreteRequest("192.168.1.1", headers);
        ConcreteRequest invalidRequest = new ConcreteRequest("192.168.1.1", null);

        try {
            loggingProcessor.process(validRequest);
            loggingProcessor.process(invalidRequest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
