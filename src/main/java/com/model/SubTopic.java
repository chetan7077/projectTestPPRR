package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SubTopic
{
	@Id
	private int sid;
	
	@Column(name = "sname")
	private String sname;
	
	@Column(name = "shours")
	private int shours;
	
	
	public SubTopic() {
		super();
	}


	public SubTopic(int sid, String sname, int shours) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.shours = shours;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getShours() {
		return shours;
	}


	public void setShours(int shours) {
		this.shours = shours;
	}


	@Override
	public String toString() {
		return "SubTopics [sid=" + sid + ", sname=" + sname + ", shours=" + shours + "]";
	}
}
