package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentService {
	
	StudentDto studentDto = null;
	Scanner scan = null;
	
	public StudentService() {
		studentDto = new StudentDto();
		scan = new Scanner(System.in);
	}
	
	public void inputStudent() {
		System.out.print("학번 >> ");
		studentDto.num = scan.nextLine();
		System.out.print("이름 >> ");
		studentDto.name = scan.nextLine();
		System.out.print("학과 >> ");
		studentDto.dept = scan.nextLine();
		System.out.print("학년 >> ");
		studentDto.grade = scan.nextLine();
		System.out.print("전화번호 >> ");
		studentDto.tel = scan.nextLine();
		System.out.print("주소 >> ");
		studentDto.addr = scan.nextLine();
	}

}
