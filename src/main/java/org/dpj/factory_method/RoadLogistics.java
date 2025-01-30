package org.dpj.factory_method;

public class RoadLogistics extends CreatorLogistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
