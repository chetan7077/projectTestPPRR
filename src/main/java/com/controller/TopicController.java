package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.Topic;
import com.service.TopicService;

@RestController
@RequestMapping("/topic")
public class TopicController 
{
	@Autowired
	TopicService topicService;
	

	@PostMapping("/add")
	public ResponseEntity<Topic>saveTopic(@RequestBody Topic t)
	{
		Topic top = topicService.addTopic(t);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add", "Topic Created").body(top);
	}
	
	

}
