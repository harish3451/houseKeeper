package com.HouseKeeper.entity;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String admin_email;
	private String admin_password;
	private String admin_name;
	
	public String getadmin_name() {
		return admin_name;
	}
	public void setadmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getadmin_email() {
		return admin_email;
	}
	public void setadmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getadmin_password() {
		return admin_password;
	}
	public void setadmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	
	
}
