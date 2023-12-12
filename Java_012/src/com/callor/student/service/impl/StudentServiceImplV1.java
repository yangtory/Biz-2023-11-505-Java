package com.callor.student.service.impl;

import com.callor.student.service.StudentService;

/*
 * StudentServiceImplV1 클래스는 StudentService interface 를
 * implements(상속, 설계를 이어받기) 하였다
 * 이때 interface 에 정의된 method 들은 반드시 만들어야 한다
 * 그렇지 않으면 코드가 오류가 발생하여 진행이 되지 않는다
 * 
 * interface 와 class 간에 하나의 규칙이 만들어지는 것이다
 * 
 * 이렇게 interface 를 implements 한 클래스를
 * "구현체" 클래스 라고 한다
 */
public class StudentServiceImplV1 implements StudentService{

	@Override
	public boolean inpuStudent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inputStudents() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStudent() {
		System.out.println("학생정보 출력 v1");
		
	}
	

}
