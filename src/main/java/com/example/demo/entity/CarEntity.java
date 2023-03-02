package com.example.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "car")

public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="brand" ,nullable = false, length = 45)
    private String brand;

    @Column(name = "price", nullable = false, length = 45)
    private BigDecimal price;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private List<CarDetailEntity> carDetailEntities;


    public CarEntity() {
    }

    public CarEntity(Integer id, String brand, BigDecimal price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
