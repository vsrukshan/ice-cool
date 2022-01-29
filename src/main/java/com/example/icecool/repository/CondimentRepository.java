package com.example.icecool.repository;

import com.example.icecool.model.Condiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CondimentRepository extends JpaRepository<Condiment, Integer> {
}
