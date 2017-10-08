package com.java.lambda;

public class Students {

	private String sname;
	private String course;
	
	Students(){}
	Students(String sname,String course){
		this.sname = sname;
		this.course = course;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
