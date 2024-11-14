package com.example.road_control_system.repositories;

import com.example.road_control_system.models.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Integer> {
}
