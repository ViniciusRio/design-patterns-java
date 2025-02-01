package org.dpj.decorator.web_system_example;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.Request;

import java.net.URI;
import java.util.Map;

public record ConcreteRequest(String ip, Map<String, String> headers) implements Request {

    @Override
    public URI getRequestURI() {
        return null;
    }

    @Override
    public String getRequestMethod() {
        return "";
    }

    @Override
    public Headers getRequestHeaders() {
        return null;
    }
}
