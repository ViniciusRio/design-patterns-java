package org.dpj.factory_method;

public class SeaLogistics extends CreatorLogistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
