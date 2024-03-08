package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Batch;
import com.service.BatchService;

@RestController
@RequestMapping("/batch")
public class BatchController 
{
	@Autowired
	BatchService batchservice;
	
	@PostMapping("/add")
	public ResponseEntity<Batch>saveBatch(@RequestBody Batch b)
	{
		Batch bch = batchservice.addBatch(b);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add", "Batch Created").body(bch);
	}	
}
