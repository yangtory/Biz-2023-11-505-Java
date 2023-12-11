package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

// 내가한거
public class StudentServiceV1 {

	StudentDto studentDto = null;
	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentServiceV1() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();

	}

	public boolean check(String check) {
		for (StudentDto dto : students) {
			if (dto.num.equals(check)) {
				return true;
			}
		}
		return false;
	}

	public boolean inputStudent() {
		while (true) {
			System.out.print("학번 >> ");
			String stdNum = scan.nextLine();
			if (stdNum.equals("QUIT"))
				return false;
			boolean bYes = check(stdNum);
			if (bYes) {
				System.out.println("학번 중복, 다시 입력하세요");
				continue;
			}

			System.out.print("이름 >> ");
			String stdName = scan.nextLine();
			if (stdName.equals("QUIT"))
				return false;

			System.out.print("학과 >> ");
			String stdDept = scan.nextLine();
			if (stdDept.equals("QUIT"))
				return false;

			System.out.print("학년 >> ");
			String stdGrade = scan.nextLine();
			if (stdGrade.equals("QUIT"))
				return false;

			System.out.print("전화번호 >> ");
			String stdTel = scan.nextLine();
			if (stdTel.equals("QUIT"))
				return false;

			System.out.print("주소 >> ");
			String stdAddr = scan.nextLine();
			if (stdAddr.equals("QUIT"))
				return false;

			studentDto = new StudentDto();
			studentDto.num = stdNum;
			studentDto.name = stdName;
			studentDto.dept = stdDept;
			studentDto.grade = stdGrade;
			studentDto.tel = stdTel;
			studentDto.addr = stdAddr;
			students.add(studentDto);
			
			return true;
		} // end while
	}

	public void inputStudents() {
		boolean result = true;
		while (result) {
			result = inputStudent();

		}
		System.out.println("입력 종료 퇴근하자!!");
	}

}
