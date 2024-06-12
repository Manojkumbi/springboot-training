package com.example.transactionmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empid;
	private String empname;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Employee(Integer empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	

}
