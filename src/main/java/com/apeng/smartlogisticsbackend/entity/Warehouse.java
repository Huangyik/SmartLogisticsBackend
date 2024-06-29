package com.apeng.smartlogisticsbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String position;
    private int capacity;

    @OneToMany
    private List<Shelve> shelves = new ArrayList<>();

    @OneToMany
    private List<Car> cars = new ArrayList<>();


    public Warehouse(String name, String position, int capacity) {
        this.name = name;
        this.position = position;
        this.capacity = capacity;
    }

}
