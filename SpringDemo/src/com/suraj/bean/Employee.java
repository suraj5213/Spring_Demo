package com.suraj.bean;

public class Employee {
	
	private String firstname;
	private String lastname;
	private Date date;
	
	public Employee() {
		super();
	}

	public Employee(String firstname, String lastname, Date date) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.date = date;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", date=" + date + "]";
	}
	
}
