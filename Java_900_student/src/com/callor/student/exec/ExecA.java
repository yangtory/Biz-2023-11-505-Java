package com.callor.student.exec;

import com.callor.student.Impl.StudentServiceImplV1;
import com.callor.student.service.StudentService;

public class ExecA {
	
	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImplV1();
		studentService.loadStd();
		studentService.input();
	}

}
