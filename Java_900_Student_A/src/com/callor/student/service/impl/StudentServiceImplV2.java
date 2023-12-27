package com.callor.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.student.exec.Line;
import com.callor.student.model.StudentDto;

public class StudentServiceImplV2 extends StudentServiceImplV1 {

	// 매개변수를 전달받아서 V1 에 입력
	public StudentServiceImplV2(String stdFile) {
		super(stdFile);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 학생의 이름 일부를 전달받아 학생의 이름이 포함된 리스트를 출력하도록
	 */
	@Override
	public StudentDto searchStudent(String name) {

		List<StudentDto> searchList = new ArrayList<>();
		for (StudentDto dto : stdList) {
			/*
			 * name.trim() : name 변수에 저장된 문자열의 앞 뒤 빈칸 제거 
			 * dto.name.contains("문자열") : dto.name 에 "문자열" 이 포함되어 있으면
			 */
			if (dto.name.contains(name.trim())) { // trim() 빈칸때문에 문자를 못찾을수 있기때문에
				searchList.add(dto);
			}
		}
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		Line.sLine(100);
		for (StudentDto dto : searchList) {
			System.out.printf("%s\t",dto.num);
			System.out.printf("%s\t",dto.name);
			System.out.printf("%s\t",dto.dept);
			System.out.printf("%s\t",dto.grade);
			System.out.printf("%s\t",dto.tel);
			System.out.printf("%s\t\n",dto.addr);
		}
		Line.dLine(100);
		return null;
	}

}
