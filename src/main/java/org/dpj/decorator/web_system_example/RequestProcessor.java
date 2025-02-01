package org.dpj.decorator.web_system_example;

public interface RequestProcessor {
    void process(ConcreteRequest request) throws IllegalAccessException;
}
