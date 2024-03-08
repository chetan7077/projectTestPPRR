package com.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Trainer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Courses> courses=new ArrayList<>();

	public Trainer() 
	{
		super();
	}
	public Trainer(int id, String name, List<Courses> courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setBatch(List<Courses> courses) {
		this.courses = courses;
	}

	
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
}
