package com.jonathan.motorcycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.motorcycle.models.Motorcycle;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
	
}
