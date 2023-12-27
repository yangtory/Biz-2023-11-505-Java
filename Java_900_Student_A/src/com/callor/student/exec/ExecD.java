package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV2;

public class ExecD {
	
	public static void main(String[] args) {
		String stdFile = "src/student.csv";
		StudentService stdService2 = new StudentServiceImplV2(stdFile);
		
		stdService2.loadStudent();
		stdService2.inputStudent();
	}

}
