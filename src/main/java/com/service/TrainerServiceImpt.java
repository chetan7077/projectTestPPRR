package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TrainerRepository;
import com.model.Trainer;

@Service
public class TrainerServiceImpt implements TrainerService {

	@Autowired
	TrainerRepository trainerRepo;
	
	@Override
	public Trainer addTrainer(Trainer t) 
	{
		return trainerRepo.save(t);
	}

}
