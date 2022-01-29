package com.example.icecool.service;

import com.example.icecool.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    private FlavourService flavourService;
    @Autowired
    private ContainerService containerService;

    public Menu getMenu() {
        return new Menu(flavourService.getAllFlavours(), containerService.getAllContainers());
    }
}
