package com.example.icecool.controller;

import com.example.icecool.model.Condiment;
import com.example.icecool.service.CondimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("condiments")
public class CondimentController {

    @Autowired
    private CondimentService condimentService;

    @GetMapping
    public List<Condiment> getAllCondiments() {
        return new ArrayList<Condiment>(this.condimentService.getAllCondiments());
    }
}
