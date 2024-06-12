package com.example.transactionmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empinsurance")
public class Insurance 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer insuranceid;
	private Integer empid;
	private String healthinsurancename;
	private int coverageamount;
	public Insurance(Integer insuranceid, Integer empid, String healthinsurancename, int coverageamount) {
		super();
		this.insuranceid = insuranceid;
		this.empid = empid;
		this.healthinsurancename = healthinsurancename;
		this.coverageamount = coverageamount;
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getInsuranceid() {
		return insuranceid;
	}
	public void setInsuranceid(Integer insuranceid) {
		this.insuranceid = insuranceid;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getHealthinsurancename() {
		return healthinsurancename;
	}
	public void setHealthinsurancename(String healthinsurancename) {
		this.healthinsurancename = healthinsurancename;
	}
	public int getCoverageamount() {
		return coverageamount;
	}
	public void setCoverageamount(int coverageamount) {
		this.coverageamount = coverageamount;
	}
	@Override
	public String toString() {
		return "Insurance [insuranceid=" + insuranceid + ", empid=" + empid + ", healthinsurancename="
				+ healthinsurancename + ", coverageamount=" + coverageamount + "]";
	}
	

}
