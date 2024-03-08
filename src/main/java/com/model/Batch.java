package com.model;

import java.util.ArrayList; 
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Batch 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bid;
	
	@Column(name = "bname")
	private String bname;
	
	@Column(name = "topics")
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.MERGE)
	private List<Topic> topics=new ArrayList<>();
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "batches")
	private List<Courses> courses = new ArrayList<>();
	
	public Batch() {
		super();
	}

	public Batch(int bid, String bname, List<Topic> topics) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.topics = topics;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", bname=" + bname + ", topics=" + topics + "]";
	}

}
