package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.SubTopic;
import com.service.SubTopicService;

@RestController
@RequestMapping("/subtopic")
public class SubTopicController 
{
	@Autowired
	SubTopicService subtopicsService;

	@PostMapping("/add")
	public ResponseEntity<SubTopic>saveSubTopics(@RequestBody SubTopic s)
	{
		SubTopic sub = subtopicsService.addSubTopic(s);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add", "Courses Created").body(sub);
	}

}
