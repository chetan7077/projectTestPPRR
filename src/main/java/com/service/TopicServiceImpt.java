package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TopicRepository;
import com.model.Topic;

@Service
public class TopicServiceImpt implements TopicService {

	@Autowired
	TopicRepository topicRepo;
	
	@Override
	public Topic addTopic(Topic t) {
		
		return topicRepo.save(t);
	}

}
