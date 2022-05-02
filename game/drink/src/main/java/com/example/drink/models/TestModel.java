package com.example.drink.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "drink")
public class TestModel {
    @Id
    @Getter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
    private int id;
    @Getter @Setter
    @Column(name = "brand")
    private String brand;
    @Getter @Setter @Column(name = "volume")
    private int volume;
    @Getter @Setter @Column(name = "price")
    private double price;
    public TestModel() {
    }
    public TestModel(int id, String brand, int volume, double price) {
        this.id = id;
        this.brand = brand;
        this.volume = volume;
        this.price = price;
    }
}
