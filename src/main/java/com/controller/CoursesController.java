package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.Courses;
import com.service.CoursesService;

@RestController
@RequestMapping("/courses")
public class CoursesController 
{
	@Autowired
	CoursesService coursesservice;
	

	@PostMapping("/add")
	public ResponseEntity<Courses>saveCourses(@RequestBody Courses c)
	{
		Courses cou = coursesservice.addCourses(c);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add", "Courses Created").body(cou);
	}
	

}
