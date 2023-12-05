package com.callor.score.exec;

import com.callor.score.service.StudentService;

public class StudentA {
	
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		studentService.loadStudents();
		studentService.printStudents();
	}

}
