package org.dpj.factory_method;


public class App {
    public static void main(String[] args) {
        CreatorLogistics creatorLogistics;
        String type = "Sea";

        if (type.equals("Road")) {
            creatorLogistics = new RoadLogistics();
        } else if (type.equals("Sea")) {
            creatorLogistics = new SeaLogistics();
        } else {
            throw new IllegalArgumentException("Invalid type: " + type);
        }

        Transport transport = creatorLogistics.createTransport();
        transport.deliver();

    }
}
