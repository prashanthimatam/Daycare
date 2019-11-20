package edu.neu.csye6200.model;


import java.util.ArrayList;
import java.util.List;

public class TeacherDataHandler {

	
// 1,Sai,Sreekar,100    ( Format of Data in teacherList) 
	
	public static List<Teacher> teacherList = new ArrayList<>(); // Holds all the data related to Teachers
	private static final String fileName = "TeacherList.txt";
	

	TeacherDataHandler(){
		FileIO fileutilobj = new FileIO();
		
		teacherList = fileutilobj.ReadTeacherCSV(this.fileName);
	}

	public static List<Teacher> getteacherlist(){
		return teacherList;
	}
	
	
	
}
