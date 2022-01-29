package com.example.icecool.service;

import com.example.icecool.model.Flavour;
import com.example.icecool.repository.FlavourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlavourService {

    @Autowired
    private FlavourRepository flavourRepository;

    public List<Flavour> getAllFlavours() {
        return new ArrayList<Flavour>(flavourRepository.findAll());
    }
}
