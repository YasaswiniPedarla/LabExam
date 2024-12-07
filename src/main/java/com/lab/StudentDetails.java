package com.lab;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentDetailsLab")
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sid;
	String sname;
	char gender;
	String dept;
	String prog;
	String dob;
	String contno;
	String gradStatus;
	float cgpa;
	int noofBlacklogs;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getProg() {
		return prog;
	}
	public void setProg(String prog) {
		this.prog = prog;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContno() {
		return contno;
	}
	public void setContno(String contno) {
		this.contno = contno;
	}
	public String getGradStatus() {
		return gradStatus;
	}
	public void setGradStatus(String gradStatus) {
		this.gradStatus = gradStatus;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public int getNoofBlacklogs() {
		return noofBlacklogs;
	}
	public void setNoofBlacklogs(int noofBlacklogs) {
		this.noofBlacklogs = noofBlacklogs;
	}
	@Override
	public String toString() {
		return "StudentDetails [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", dept=" + dept + ", prog="
				+ prog + ", dob=" + dob + ", contno=" + contno + ", gradStatus=" + gradStatus + ", cgpa=" + cgpa
				+ ", noofBlacklogs=" + noofBlacklogs + "]";
	}	
	
	
	
	
	

}