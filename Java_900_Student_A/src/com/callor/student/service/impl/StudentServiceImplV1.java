package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.exec.Line;
import com.callor.student.model.StdIndex;
import com.callor.student.model.StudentDto;
import com.callor.student.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	
	/*
	 * 학생 정보를 파일로 부터 읽어서 메모리로 load
	 * 학생 정보 파일, 파일을 읽는 도구, 저장할 장소(List)
	 */
	protected List<StudentDto> stdList = null;
	protected String stdFile = null;
	/**
	 * 생성자 메서드를 사용하는 방법
	 * @param 학생정보파일
	 */
	public StudentServiceImplV1(String stdFile) {
		this.stdFile = stdFile;
		this.stdList = new ArrayList<StudentDto>();
	}
	
	@Override
	public void loadStudent() {
		
		Scanner fileRead = null;
		InputStream is = null;
		
		try {
			is = new FileInputStream(this.stdFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(this.stdFile + "파일을 찾을 수 없음");
			return; // 끝내버리기
		}
		
		fileRead = new Scanner(is);
		while(fileRead.hasNext()){
			String line = fileRead.nextLine();
			String[] students = line.split(",");
			// StudnetDto 클래스의 필드 생성자에 값을 주입하여
			// 데이터가 포함된 dto 객체 생성하기
			StudentDto stdDto = new StudentDto(
							students[StdIndex.학번.index], 
							students[StdIndex.이름.index], 
							students[StdIndex.학과.index], 
							students[StdIndex.학년.index], 
							students[StdIndex.전화.index], 
							students[StdIndex.주소.index]);
			stdList.add(stdDto);
		}
		fileRead.close();
		
		// stdList 테스트 코드
//		for(StudentDto dto: stdList) {
//			System.out.println(dto);
//		}
	}

	@Override
	public void inputStudent() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			Line.dLine(100);
			System.out.println("찾는 학생이름을 입력하세요(종료:QUIT)");
			Line.sLine(100);
			System.out.print("이름 >> ");
			String strName = scan.nextLine();
			
			if(strName.isBlank()) {
				System.out.println("학생 이름을 입력해주세요");
				continue;
			}
			if(strName.equals("QUIT")) {
				System.out.println("검색을 종료합니다");
				break;
			}
			StudentDto stdDto = this.searchStudent(strName);
			if(stdDto == null) {
				Line.dLine(100);
				System.out.println(strName + "자료는 없습니다");
				Line.dLine(100);
			} else {
				this.printStudent(stdDto);
			}
		}
	}
	
	/*
	 * 학생 이름을 매개변수로 전달받아 stdList 에서 찾고
	 * 있으면 학생정보를 StudentDto 에 담아 return
	 * 없으면 null 을 return
	 */
	@Override
	public StudentDto searchStudent(String name) {
		for(StudentDto dto : stdList) {
			if(dto.name.equals(name)) {
				return dto;
			}
		}
		return null;
	}

	@Override
	public void printStudent(StudentDto stdDto) {
		Line.dLine(100);
		System.out.printf("이름 : %s\n",stdDto.name);
		System.out.printf("학과 : %s\n",stdDto.dept);
		System.out.printf("학년 : %s 학년\n",stdDto.grade);
		System.out.printf("전화 : %s\n",stdDto.tel);
		System.out.printf("주소 : %s\n",stdDto.addr);
		
	}

}
