package com.suraj.bean;

public class Date {
	
	private String birthdate;
	private String joindate;
	
	public Date() {
		super();
	}

	public Date(String birthdate, String joindate) {
		super();
		this.birthdate = birthdate;
		this.joindate = joindate;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "Date [birthdate=" + birthdate + ", joindate=" + joindate + "]";
	}	
	
	

}
