package com.example.demo.dto;

import com.example.demo.model.HumanReport;

//Object to JSON
public class HumanDtoSe {  //for Serialization
	private Integer id;
	private String name;
	private Integer age;
	HumanReport humanReport;
	public HumanDtoSe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HumanDtoSe(Integer id, String name, Integer age, HumanReport humanReport) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.humanReport = humanReport;
	}
	@Override
	public String toString() {
		return "HumanDtoSe [id=" + id + ", name=" + name + ", age=" + age + ", humanReport=" + humanReport + "]";
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
