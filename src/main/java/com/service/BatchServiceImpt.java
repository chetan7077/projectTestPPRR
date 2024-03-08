package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.BatchRepository;
import com.model.Batch;

@Service
public class BatchServiceImpt implements BatchService{

	@Autowired
	BatchRepository batchRepo;
	
	@Override
	public Batch addBatch(Batch b) {
		
		return batchRepo.save(b);
	}

}
