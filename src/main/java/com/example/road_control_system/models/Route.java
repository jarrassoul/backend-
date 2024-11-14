package com.example.road_control_system.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "routes")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Route {
    @Id @GeneratedValue
    private int id;
    private String route;


}
