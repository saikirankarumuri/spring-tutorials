package com.sai.spring;


//bean or model or pojo

public class Student {
	
	int id;
	String fname;
	String lname;
	StudentInfo student;
	
	public Student(){
		
	}
	
	public void myinIt(){
		System.out.println("Inside Init method");
	}
	public void mydestroy(){
		System.out.println("Object Destroyed");
	}

	public Student(StudentInfo student) {
		
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public StudentInfo getStudent() {
		return student;
	}

	public void setStudent(StudentInfo student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", student=" + student + "]";
	}
	

}
