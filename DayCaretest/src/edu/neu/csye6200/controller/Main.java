package edu.neu.csye6200.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.model.Classdatahandler;
import edu.neu.csye6200.model.FileIO;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.StudentFactory;
import edu.neu.csye6200.view.Studentview;

public class Main {
//
//	public static void addstudent(String csvdata){
//		assignstudent.toclass(StudentFactory.getobject(csvdata));
		
		public static void addstudent(String fileName) {
			FileIO fileutilobj = new FileIO();

			List<Student> templist = new ArrayList<Student>();

			templist = fileutilobj.ReadStudentCSV(fileName);

		

		for(Student singlestudent: templist) {

			assignstudent.toclass(singlestudent);
		}

	}
		
		
		
public static void newRegistration() {
	
	//Student singlestudent = new Student();
	assignstudent.toclass(new AddStudentRegistration().addStudent(new StudentRegistration(10,"SSS","Sidd",4,23,"SCS","Sidd","115NOrth",4264,LocalDate.parse("2018-11-10"),1,1,1,1,1,1)));
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Main.addstudent("1,Jim,Thomas,9,Micheal,Thomas,0,Boston MA,55445");
//		Main.addstudent("2,Jim,Thomas,7,Micheal,Thomas,0,Boston MA,55445");
//		Main.addstudent("3,Jim,Thomas,10,Micheal,Thomas,0,Boston MA,55445");
//		Main.addstudent("4,Jim,Thomas,11,Micheal,Thomas,0,Boston MA,55445");
//		Main.addstudent("5,Jim,Thomas,24,Micheal,Thomas,0,Boston MA,55445");
//		Main.addstudent("6,Jim,Thomas,26,Micheal,Thomas,0,Boston MA,55445");
//		Studentview.viewall();
		assignstudent.toclass(new AddStudentRegistration().addStudent(new StudentRegistration(10,"SSS","Sidd",4,23,"SCS","Sidd","115NOrth",4264,LocalDate.parse("2018-11-10"),1,1,1,1,1,1)));
		
		
		Main.addstudent("C:\\Users\\yccha\\git\\DayCare\\DayCaretest\\src\\edu\\neu\\csye6200\\Students.txt");
		Studentview.viewall();
		
		FileIO fileutil = new FileIO();
		fileutil.writeStudentCSV("StudentDatabase", Classdatahandler.getclassrooms(1).get(0));
		
	
		
	
	
	}
	
        //assignstudent.toclass(new AddStudentRegistration.addStudent(new StudentRegistration(10,"SSS","Sidd",23,"SCS","Sidd",4,"115NOrth",4264,"2018-11-10",1,1,1,1,1,1))));
		
	

		
	
}

