package com.callor.student.Impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

// 이름의 일부만 적어도 출력되게 해보기 
public class StudentServiceImplV1 implements StudentService {
	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentServiceImplV1() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();
	}

	@Override
	public void input() {

		StudentDto stdDto = new StudentDto();
		while (true) {
			Line.dLine(80);
			System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT 를 입력)");
			Line.sLine(80);
			System.out.print("이름 >> ");
			String inputStr = scan.nextLine();

			if (inputStr.equals("QUIT")) {
				System.out.println("업무 끝!");
				break;
			}
			if(inputStr.isBlank()) {
				System.out.println("이름을 다시 입력해주세요");
				continue;
			}
			
			try {
				this.printStd(inputStr);					
			} catch (Exception e) {
				System.out.println("입력된 정보가 없습니다! 다시 입력해주세요.");
			}
		}
	}

	// 중복된 dto 리턴받기
	@Override
	public StudentDto selectStdName(String name) {
		for (StudentDto dto : students) {
			if (dto.name.equals(name))
				return dto;
		}
		return null;
	}

	@Override
	public void loadStd() {
		String dataFile = "src/com/callor/student/utils/student.txt";
		InputStream is = null;
		Scanner fileScan = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		while (fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] stds = line.split(",");

			// enum 만들어서 해보기
			StudentDto dto = new StudentDto();
			dto.num = stds[0];
			dto.name = stds[1];
			dto.dept = stds[2];
			dto.grade = stds[3];
			dto.tel = stds[4];
			dto.addr = stds[5];
			students.add(dto);
		}
		fileScan.close();
	}

	@Override
	public void printStd(String inputStr) {
		StudentDto dtoStd = this.selectStdName(inputStr);
		System.out.printf("학번 : %s \n", dtoStd.num);
		System.out.printf("이름 : %s \n", dtoStd.name);
		System.out.printf("학과 : %s \n", dtoStd.dept);
		System.out.printf("학년 : %s \n", dtoStd.grade);
		System.out.printf("번호 : %s \n", dtoStd.tel);
		System.out.printf("주소 : %s \n", dtoStd.addr);
		Line.dLine(80);
	}
}
