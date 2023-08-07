package com.example.demo.dto;

import com.example.demo.model.HumanReport;

//JSON to Object
public class HumanDtoDeS {    //for Deserialisation
	
	private String name;
	private Integer age;
	HumanReport humanReport;
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
	@Override
	public String toString() {
		return "HumanDtoDeS [name=" + name + ", age=" + age + ", humanReport=" + humanReport + "]";
	}
	public HumanDtoDeS(String name, Integer age, HumanReport humanReport) {
		super();
		this.name = name;
		this.age = age;
		this.humanReport = humanReport;
	}
	public HumanDtoDeS() {
		super();
		// TODO Auto-generated constructor stub
	}

	}
