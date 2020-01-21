package com.naseeha;

import java.util.ArrayList;
import java.util.List;

public class StudentData {

	static List<Student> getAllStudents(){
		List<Student> AllStudents = new ArrayList<>();
		
		AllStudents.add(new Student("Nuha",55));
		AllStudents.add(new Student("Nada",65));
		AllStudents.add(new Student("Zuha",95));
		AllStudents.add(new Student("Amna",75));
		
		return AllStudents;
		
	}
}
