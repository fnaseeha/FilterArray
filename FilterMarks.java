package com.naseeha;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMarks {

	public static void main(String[] args) {
		
		List<Student> filterResult = 
				StudentData.getAllStudents().stream()
				.filter(s->s.getMarks()>60)
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		
		System.out.println(filterResult);

	}

}
