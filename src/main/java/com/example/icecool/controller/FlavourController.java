package com.example.icecool.controller;

import com.example.icecool.model.Flavour;
import com.example.icecool.service.FlavourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("flavours")
public class FlavourController {

    @Autowired
    private FlavourService flavourService;

    @GetMapping
    public List<Flavour> getAllFlavours() {
        return new ArrayList<Flavour>(this.flavourService.getAllFlavours());
    }
}
