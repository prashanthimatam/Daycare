package edu.neu.csye6200.controller;

import java.time.LocalDate;
import java.util.List;

import edu.neu.csye6200.model.ImmunizationFactory;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.model.Vaccine;

public class StudentRegistration {

	private int grade;
	private int age;
	private String parentfirstname;
	private String parentlastname;
	private String address;
	private int phonenum;
	private Teacher teacher;
	private List<Vaccine> record;
	private LocalDate regDate;
	private int id;
	private String firstName;
	private String lastName;
	
	
	public StudentRegistration(int id, String fNmae, String lname, int grade, int age, String parentfirstname, String parentlastname, String address,
			int phonenum, LocalDate regDate, int vacc1, int vacc2, int vacc3, int vacc4, int vacc5, int vacc6) {
		super();
		this.id = id;
		this.firstName = fNmae;
		this.lastName = lname;
		this.grade = grade;
		this.age = age;
		this.parentfirstname = parentfirstname;
		this.parentlastname = parentlastname;
		this.address = address;
		this.phonenum = phonenum;
		//this.teacher = teacher;
		
		List<Vaccine> studentVaccineList = new ImmunizationFactory().studentImmunizationRequirement();
		
		
		studentVaccineList.get(0).setDosage(vacc1);
		studentVaccineList.get(1).setDosage(vacc2);
		studentVaccineList.get(2).setDosage(vacc3);
		studentVaccineList.get(3).setDosage(vacc4);
		studentVaccineList.get(4).setDosage(vacc5);
		studentVaccineList.get(5).setDosage(vacc6);
		
		
		this.record = studentVaccineList;
	
		this.regDate = regDate;
	}
	
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getParentfirstname() {
		return parentfirstname;
	}
	public void setParentfirstname(String parentfirstname) {
		this.parentfirstname = parentfirstname;
	}
	public String getParentlastname() {
		return parentlastname;
	}
	public void setParentlastname(String parentlastname) {
		this.parentlastname = parentlastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Vaccine> getRecord() {
		return record;
	}
	public void setRecord(List<Vaccine> record) {
		this.record = record;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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


	
	
	
	
	

	
	
	
	
}
