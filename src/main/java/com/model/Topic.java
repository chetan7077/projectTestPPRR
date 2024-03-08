package com.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import com.model.Batch;

@Entity
public class Topic 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tid;
	private String tname;
	private int hours;
	

	@OneToMany(fetch=FetchType.EAGER)
	private List<SubTopic> subtopic=new ArrayList<>();

	
	@ManyToOne(cascade = CascadeType.MERGE)
	private Batch batch;
	
	
	public Topic() {
		super();
	}


	public Topic(int tid, String tname, int hours, List<SubTopic> subtopic) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.hours = hours;
		this.subtopic = subtopic;
	}


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public List<SubTopic> getSubtopic() {
		return subtopic;
	}


	public void setSubtopic(List<SubTopic> subtopic) {
		this.subtopic = subtopic;
	}


	@Override
	public String toString() {
		return "Topic [tid=" + tid + ", tname=" + tname + ", hours=" + hours + ", subtopic=" + subtopic + "]";
	}
}
