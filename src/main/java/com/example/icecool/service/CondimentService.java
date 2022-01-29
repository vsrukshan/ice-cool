package com.example.icecool.service;

import com.example.icecool.model.Condiment;
import com.example.icecool.repository.CondimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CondimentService {

    @Autowired
    private CondimentRepository condimentRepository;

    public List<Condiment> getAllCondiments() {
        return new ArrayList<Condiment>(condimentRepository.findAll());
    }
}
