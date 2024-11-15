package com.example.road_control_system.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "vehicle")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id @GeneratedValue
    private int id;
    private String type;
    private String licenseplate;
    private Double weight;
    private String model;
}

