package com.example.icecool.controller;

import com.example.icecool.model.Container;
import com.example.icecool.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("containers")
public class ContainerController {

    @Autowired
    private ContainerService containerService;

    @GetMapping
    public List<Container> getAllContainer() {
        return new ArrayList<Container>(this.containerService.getAllContainers());
    }
}
