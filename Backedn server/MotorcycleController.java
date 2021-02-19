package com.jonathan.motorcycle.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jonathan.motorcycle.models.Motorcycle;
import com.jonathan.motorcycle.repositories.MotorcycleRepository;

@RestController

@RequestMapping("/api/v1/bikes")

public class MotorcycleController {
	
	@Autowired
	private MotorcycleRepository bikeRepository;
	
	@GetMapping
	public List<Motorcycle>list(){
		return bikeRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Motorcycle bike) {
		bikeRepository.save(bike);
	}
	
	@GetMapping("/{id}")
	public Motorcycle get(@PathVariable("id") long id) {
		return bikeRepository.getOne(id);
		
	
	}
}
