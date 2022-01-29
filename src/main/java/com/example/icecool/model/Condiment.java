package com.example.icecool.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Condiment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "condiment")
    private List<CondimentType> condimentTypes;


    public List<CondimentType> getCondimentTypes() {
        return condimentTypes;
    }

    public void setCondimentTypes(List<CondimentType> condimentTypes) {
        this.condimentTypes = condimentTypes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
