package com.suchiit.model;

public class Student {
private int sno;
private String sname;
private String saddr;
private String gender;
private String from;
private String to;
private String[] languages;
public String[] getLanguages() {
	return languages;
}
public void setLanguages(String[] languages) {
	this.languages = languages;
}
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSaddr() {
	return saddr;
}
public void setSaddr(String saddr) {
	this.saddr = saddr;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
}
