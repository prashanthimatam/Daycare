package edu.neu.csye6200.model;

import java.time.LocalDate;
import java.util.List;

public class StudentFactory {

		public static Student getobject() {
			return new Student();
		}
		
		public static Student getobject(String csvData) {
			String[] tokens = csvData.split(",");
			int Id= Integer.parseInt(tokens[0]);  
			String firstname = tokens[1];
			String lastname = tokens[2];
			int age= Integer.parseInt(tokens[3]);
			String parentfirstname = tokens[4];
			String parentlastname = tokens[5];
			int grade= Integer.parseInt(tokens[6]);
			String address = tokens[7];
			int phonenum = Integer.parseInt(tokens[8]);
			LocalDate regDate = LocalDate.parse(tokens[9]);
			int shotsTakenVacc1 = Integer.parseInt(tokens[10]);
			int shotsTakenVacc2 = Integer.parseInt(tokens[11]);
			int shotsTakenVacc3 = Integer.parseInt(tokens[12]);
			int shotsTakenVacc4 = Integer.parseInt(tokens[13]);
			int shotsTakenVacc5 = Integer.parseInt(tokens[14]);
			int shotsTakenVacc6 = Integer.parseInt(tokens[15]);
			
			
			Student student = getobject();
			student.setAge(age);
			student.setId(Id);
			student.setFirstname(firstname);
			student.setLastname(lastname);
			student.setGrade(grade);
			student.setParentfirstname(parentfirstname);
			student.setParentlastname(parentlastname);
			student.setAddress(address);
			student.setPhonenum(phonenum);
			student.setRegDate(regDate);
			
			List<Vaccine> studentVaccineList = new ImmunizationFactory().studentImmunizationRequirement();
			
			studentVaccineList.get(0).setDosage(shotsTakenVacc1);
			studentVaccineList.get(1).setDosage(shotsTakenVacc2);
			studentVaccineList.get(2).setDosage(shotsTakenVacc3);
			studentVaccineList.get(3).setDosage(shotsTakenVacc4);
			studentVaccineList.get(4).setDosage(shotsTakenVacc5);
			studentVaccineList.get(5).setDosage(shotsTakenVacc6);
			
			student.setRecord(studentVaccineList);
			
			return student;
		}
		
}
