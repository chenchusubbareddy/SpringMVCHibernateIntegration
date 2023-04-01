package com.app.hb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "std")
@Entity
public class Student {

	@Id
	private int sid;

	@Column(name = "semail")
	private String email;

	@Column(name = "sfname")
	private String firstName;

	@Column(name = "slname")
	private String lastName;

	@Column(name = "dob")
	private String dob;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Student(int sid, String email, String firstName, String lastName, String dob) {
		super();
		this.sid = sid;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + "]";
	}
	
	

}
