package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "car_detail")
public class CarDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="model" ,nullable = false, length = 45)
    private String model;

    @Column(name="color" ,nullable = false, length = 45)
    private String color;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "car_id")
    private CarEntity car;
}
