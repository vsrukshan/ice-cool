package com.example.icecool.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class CondimentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Double price;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "condiment", nullable = false, insertable = false)
    private Condiment condiment;

    @ManyToMany(mappedBy = "availableCondimentTypes")
    @JsonIgnore
    List<Flavour> flavours;

    public Condiment getCondiment() {
        return condiment;
    }

    public void setCondiment(Condiment condiment) {
        this.condiment = condiment;
    }

    public List<Flavour> getFlavours() {
        return flavours;
    }

    public void setFlavours(List<Flavour> flavours) {
        this.flavours = flavours;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        CondimentType condimentType = (CondimentType) obj;
        return this.id.equals(condimentType.id);
    }
}
