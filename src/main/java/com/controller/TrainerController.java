package com.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Trainer;
import com.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController 
{
	@Autowired
	TrainerService trainerservice;
	
	@PostMapping("/add")
	public ResponseEntity<Trainer>saveTrainer(@RequestBody Trainer t)
	{
		Trainer tr = trainerservice.addTrainer(t);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add", "Trainer  Created").body(tr);
	}
	/*
	@PostMapping("/add")
	public ResponseEntity<User>saveUser(@RequestBody User u)
	{
		User ur = userSerivce.saveUser(u);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add", "User Created").body(ur);
	}*/

}
