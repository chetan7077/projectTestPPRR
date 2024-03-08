package com.model;

import java.util.ArrayList; 
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
public class Courses 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	
	@Column(name = "cname")
	private String cname;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(
	    name = "courses_batches",
	    joinColumns = @JoinColumn(name = "courses_cid"),
	    inverseJoinColumns = @JoinColumn(name = "batches_bid")
	)
	private List<Batch> batches=new ArrayList<>();
	
	@ManyToMany(mappedBy = "courses")
	private List<Trainer> trainers = new ArrayList<>();

	public Courses() {
		super();
	}
	public Courses(int cid, String cname, List<Batch> batches) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.batches = batches;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Batch> getBatch() {
		return batches;
	}
	public void setTopic(List<Batch> batches) {
		this.batches = batches;
	}
	
	public List<Batch> getBatches() {
		return batches;
	}
	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}
	public List<Trainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}
	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", cname=" + cname + ", batches=" + batches + "]";
	}
}
