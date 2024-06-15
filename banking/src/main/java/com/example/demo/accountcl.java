package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class accountcl {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer accountno;
	private String  accountholdername;
	private Integer balance;
	public accountcl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public accountcl(Integer accountno, String accountholdername, Integer balance) {
		super();
		this.accountno = accountno;
		this.accountholdername = accountholdername;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "accountcl [accountno=" + accountno + ", accountholdername=" + accountholdername + ", balance=" + balance
				+ ", getAccountno()=" + getAccountno() + ", getAccountholdername()=" + getAccountholdername()
				+ ", getBalance()=" + getBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Integer getAccountno() {
		return accountno;
	}
	public void setAccountno(Integer accountno) {
		this.accountno = accountno;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
}
