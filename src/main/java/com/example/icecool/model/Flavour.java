package com.example.icecool.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Flavour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Double price;

    @ManyToMany
    @JoinTable(name = "flavour_condiment_type",
            joinColumns = @JoinColumn(name = "flavour_id"),
            inverseJoinColumns = @JoinColumn(name = "condiment_type_id")
    )
    private List<CondimentType> availableCondimentTypes;

    public Integer getId() {
        return id;
    }

    public List<CondimentType> getAvailbleCondimentTypes() {
        return availableCondimentTypes;
    }

    public void setAvailbleCondimentTypes(List<CondimentType> availbleCondimentTypes) {
        this.availableCondimentTypes = availbleCondimentTypes;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
