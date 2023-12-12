package com.callor.student.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

/*
 * 키보드를 통해서 학생정보를 입력받고
 * StudentDto 에 추가한 다음
 * List<StudentDto> students 리스트에 추가하기
 */
public class StudentServiceV3 {

	// 클래스 영역에 선언된 변수(객체)들
	// 인스턴스 변수, 멤버 변수
	// 클래스 영역에 선언된 변수나 객체는 private 으로 선언한다
	// 다만 이클래스를 누군가 상속하여 사용할 것으로 예상되면
	// protected 로 선언한다
	private Scanner scan = null;
	private List<StudentDto> students = null;

	// 클래스 영역에 선언된 변수는 생성자 method 에서
	// 값을 초기화 하여 사용할 준비를 한다
	public StudentServiceV3() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();
		
	}

	private String itemInput(String title) {
		while (true) {
			System.out.print(title + " 입력(QUIT : 종료) >> ");
			String inputStr = scan.nextLine();
			// 아무런 값도 입력하지 않고 Enter 누르기 금지
			if (inputStr.isBlank()) {
				System.out.printf("*** %s 값은 반드시 입력!!!", title);
				continue;
			}
			// 키보드로 QUIT 를 입력하면?
			if (inputStr.equals("QUIT")) {
				this.printStudent();
				return null;
			}
			return inputStr;
		}
	}

	// 한 학생의 정보를 입력받는 method
	public boolean inputStudent() {

		String strNum = null;
		String strName = null;
		String strDept = null;
		String strGrade = null;
		String strTel = null;
		String strAddr = null;

		// 입력한 학번이 이미 students 요소중에 있으면
		// 다시 학번을 입력받기 위하여
		// 학번 입력 부분을 무한 반복 처리
		while (true) {
			strNum = this.itemInput("학번");
			if (strNum == null)
				return false;
			// 학번에서 아무 값더 입력하지 않고 enter를 눌렀을때
			// void 일때 return 하면 입력을 끝냄

			// 중복 찾기 코드
			int index = 0;
			int size = students.size();
			for (index = 0; index < size; index++) {
				if (students.get(index).num.equals(strNum)) {
					break;
				}
			}
			if (index < size) {
				System.out.println("** 학번 중복");
				continue;
			} else {
				break;
			}

		}
		strName = this.itemInput("이름");
		if (strName == null)
			return false;

		strDept = this.itemInput("학과");
		if (strDept == null)
			return false;

		strGrade = this.itemInput("학년");
		if (strGrade == null)
			return false;

		strTel = this.itemInput("전화번호");
		if (strTel == null)
			return false;

		strAddr = this.itemInput("주소");
		if (strAddr == null)
			return false;

		StudentDto stdDto = new StudentDto();
		stdDto.num = strNum;
		stdDto.name = strName;
		stdDto.dept = strDept;
		stdDto.grade = strGrade;
		stdDto.tel = strTel;
		stdDto.addr = strAddr;
		students.add(stdDto);

		return true;

	} // end inputStudent()

	public void inputStudents() {
		while (true) {
			boolean bYes = this.inputStudent();
			// if(bYes == false)
			// if(bYes != true)
			// 위랑 같은 의미
			if (!bYes) {
				break;
			}
		}
		System.out.println("업무 종료!!");
	} // end inputStudents

	public void printStudent() {
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		System.out.println("-".repeat(80));
		for (StudentDto dto : students) {
			System.out.printf("%s\t", dto.num);
			System.out.printf("%s\t", dto.name);
			System.out.printf("%s\t", dto.dept);
			System.out.printf("%s\t", dto.grade);
			System.out.printf("%s\t", dto.tel);
			System.out.printf("%s\n", dto.addr);
		}
		System.out.println("=".repeat(80));
	} // end printStudent()

	public void loadStudent() {
		String dataFile = "src/com/callor/student/models/student.txt";
		InputStream is = null;
		Scanner fileScan = null;
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		
		while(fileScan.hasNext()) {
			String line = fileScan.nextLine();
			String[] stds = line.split(",");
			
			StudentDto stDto = new StudentDto();
			stDto.num = stds[0];
			stDto.name = stds[1];
			stDto.dept = stds[2];
			stDto.grade = stds[3];
			stDto.tel = stds[5];
			stDto.addr = stds[6];
			students.add(stDto);
		}
		fileScan.close();
	} //end loadStudent()
}
