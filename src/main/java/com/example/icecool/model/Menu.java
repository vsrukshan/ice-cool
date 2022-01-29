package com.example.icecool.model;

import java.util.List;

public class Menu {

    private List<Flavour> flavours;
    private List<Container> containers;

    public Menu(List<Flavour> flavours, List<Container> containers) {
        this.flavours = flavours;
        this.containers = containers;
    }

    public List<Flavour> getFlavours() {
        return flavours;
    }

    public void setFlavours(List<Flavour> flavours) {
        this.flavours = flavours;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }
}
