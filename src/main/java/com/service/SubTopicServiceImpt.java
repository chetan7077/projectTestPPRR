package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SubTopicRepository;
import com.model.SubTopic;

@Service
public class SubTopicServiceImpt implements SubTopicService{

	@Autowired
	SubTopicRepository subtopicRepo;
	
	@Override
	public SubTopic addSubTopic(SubTopic s) {
		
		return subtopicRepo.save(s);
	}

}
