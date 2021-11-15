package com.rays.Collection;

public class Marksheet implements Comparable<Marksheet>{
	
	public String rollNo;
	public String fname;
	public String lname;
	public int phy;
	public int che;
	public int mat;
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
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
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChe() {
		return che;
	}
	public void setChe(int che) {
		this.che = che;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	@Override
	public int compareTo(Marksheet m) {
		return rollNo.compareTo(m.rollNo);
	}
	

}
