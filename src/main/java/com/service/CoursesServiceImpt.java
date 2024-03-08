package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CoursesRepository;
import com.model.Batch;
import com.model.Courses;

@Service
public class CoursesServiceImpt implements CoursesService {

	@Autowired
	CoursesRepository coursesRepo;
	
	@Override
	public Courses addCourses(Courses c) {
		
		/*
		 // Make sure to set the relationship on both sides
        for (Batch batch : c.getBatch()) {
            batch.getCourses().add(c);
        }
		*/
		return coursesRepo.save(c);
	}

}
