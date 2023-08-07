package com.example.demo.dto;

public class HumanReportDetails {
	private Integer id;
	private String BG;
	private String fatherName;
	private String motherName;
	public HumanReportDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HumanReportDetails(Integer id, String bG, String fatherName, String motherName) {
		super();
		this.id = id;
		BG = bG;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "HumanReportDetails [id=" + id + ", BG=" + BG + ", fatherName=" + fatherName + ", motherName="
				+ motherName + "]";
	}
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
}
