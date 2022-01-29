package com.example.icecool.service;

import com.example.icecool.model.Container;
import com.example.icecool.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContainerService {

    @Autowired
    private ContainerRepository containerRepository;

    public List<Container> getAllContainers() {

        return new ArrayList<>(containerRepository.findAll());
    }
}
