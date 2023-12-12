package com.callor.student.exec;

import com.callor.student.service.StudentServiceV3A;

public class StudentExecC {
	public static void main(String[] args) {
		StudentServiceV3A studentService = new StudentServiceV3A();
		
		studentService.inputStudents();
		studentService.printStudent();
	}

}
