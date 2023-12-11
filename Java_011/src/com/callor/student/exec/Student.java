
package com.callor.student.exec;

import com.callor.student.service.StudentService;

public class Student {
	
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		
		studentService.inputStudent();
	}
}
