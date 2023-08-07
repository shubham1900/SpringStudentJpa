package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "humanReport")
public class HumanReport {
	@Id
	@GeneratedValue
 private Integer id;
	private String BG;
	private String fatherName;
	private String motherName;
	@OneToOne
	@PrimaryKeyJoinColumn(name = "human_id")
	private Human human;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBG() {
		return BG;
	}
	public void setBG(String bG) {
		BG = bG;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public Human getHuman() {
		return human;
	}
	public void setHuman(Human human) {
		this.human = human;
	}
	public HumanReport(Integer id, String bG, String fatherName, String motherName, Human human) {
		super();
		this.id = id;
		this.BG = bG;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.human = human;
	}
	public HumanReport( String bG, String fatherName, String motherName, Human human) {
		super();
		this.BG = bG;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.human = human;
	}
	public HumanReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//because of cyclic dependency we are removing human object in it
	@Override
	public String toString() {
		return "HumanReport [id=" + id + ", BG=" + BG + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ "]";
	}
	
	
	
	
}
