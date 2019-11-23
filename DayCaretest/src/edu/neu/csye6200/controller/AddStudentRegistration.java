package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.Student;

public class AddStudentRegistration {

	
	public Student addStudent(StudentRegistration obj) {
		
		Student newStudent = new Student();
		
		newStudent.setId(obj.getId());
		newStudent.setFirstname(obj.getFirstName());
		newStudent.setLastname(obj.getLastName());
		newStudent.setAge(obj.getAge());
		newStudent.setGrade(obj.getGrade());
		newStudent.setParentfirstname(obj.getParentfirstname());
		newStudent.setParentlastname(obj.getParentlastname());
		newStudent.setAddress(obj.getAddress());
		newStudent.setPhonenum(obj.getPhonenum());
		newStudent.setRecord(obj.getRecord());
		newStudent.setRegDate(obj.getRegDate());
		
		return newStudent;
	}
	
	
}
