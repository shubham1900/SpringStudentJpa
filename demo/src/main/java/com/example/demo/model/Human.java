package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Human {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer age;

	@OneToOne(mappedBy = "human", cascade=CascadeType.ALL)
	HumanReport humanReport;

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Human(Integer id, String name, Integer age, HumanReport humanReport) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.humanReport = humanReport;
	}
	
	public Human( String name, Integer age, HumanReport humanReport) {
		super();
		
		this.name = name;
		this.age = age;
		this.humanReport = humanReport;
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", age=" + age + ", humanReport=" + humanReport + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public HumanReport getHumanReport() {
		return humanReport;
	}

	public void setHumanReport(HumanReport humanReport) {
		this.humanReport = humanReport;
	}
	

}
