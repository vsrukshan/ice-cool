package com.example.icecool.model;

import java.util.List;

public class OrderItem {

    private Flavour flavour;
    private List<CondimentType> condimentTypes;
    private Container container;

    public Flavour getFlavour() {
        return flavour;
    }

    public void setFlavour(Flavour flavour) {
        this.flavour = flavour;
    }

    public List<CondimentType> getCondimentTypes() {
        return condimentTypes;
    }

    public void setCondimentTypes(List<CondimentType> condiments) {
        this.condimentTypes = condiments;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}
