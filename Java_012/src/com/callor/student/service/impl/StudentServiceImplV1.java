package com.callor.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StdIndex;
import com.callor.student.models.StudentDto;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

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
public class StudentServiceImplV1 implements StudentService {

	// 현재 ImplV1 클래스를 다른 클래스가 상속하였을때
	// protected 로 선언된 변수는 같이 상속이 된다
	// 즉 ImplV1 을 상속한 클래스에서는 별도로
	// students 리스트 각체(변수)를 선언하지 않아도 된다
	protected List<StudentDto> students = null;
	protected Scanner keyBD = null;

	public StudentServiceImplV1() {
		students = new ArrayList<StudentDto>();
		keyBD = new Scanner(System.in);
	}

	// 학번을 매개변수로 전달받아 students 리스트를 검색하여
	// 동일한 학번의 요소가 있으면 그 요소를 return
	// 없으면 null 을 return
	protected StudentDto selectStdNum(String num) {
		// TODO: 학생정보 찾기
		for (StudentDto std : students) {
			if (std.num.equals(num)) {
				return std;
			}
		}
		// 여기에 코드가 도달하면, 같은 학번이 없다
		return null;
	}
	protected String newStdNum() {
		String stdNum = "S0001";
		// ! 있으니까 데이터가 있으면
		if(!students.isEmpty()) {
			
			// students 리스트의 가장 "마지막 요소"의 학번을 데려와서
			stdNum = students.get(students.size()-1).num;
			
			// num 데이터의 맨 첫번째 한개 글자를 추출하기
			// S0001 이라면 S를 추출 
			String frefix = stdNum.substring(0,1);
			
			// 마지막 학번 친구데려와서 S0100 이라면 0100 만 추출하기
			stdNum = stdNum.substring(1);
		
			stdNum = String.format("%s%04d", frefix, Integer.valueOf(stdNum)+1);
		}
		return stdNum;
	}

	@Override
	public boolean inputStudent() {
		// TODO: 한 학생의 정보 입력받기
		// 키보드로 학생의 개별 정보들(학번,이름 .. 등등) 을 입력받고
		// 임시로 저장할 배열
		// stdIndex enum 에 선언된 요소의 개수를 세어서
		// 그 개수를 사용하여 inputStr 배열을 생성하기
		String[] inputStr = new String[StdIndex.values().length];
		for (StdIndex item : StdIndex.values()) {
			while (true) {
				String newStdNum = this.newStdNum(); // 새 학번만들기 가져옴
				System.out.printf("%s(%s) 입력(QUIT : 종료) >> ", item, newStdNum);
				String str = keyBD.nextLine();
				if (str.equals("QUIT"))
					return false;
				// 학번을 입력하는 경우 학번의 중복검사를 실시한다 , && 앞이 true 일때 실행된다
				if (item.toString().equals("학번")) {
					// 학번일경우 빈칸 검사
					if(str.isBlank()) {
						System.out.printf("** 학번은 %s 를 사용함\n", newStdNum);
					}
					
					if(this.selectStdNum(str) != null) { // toString 문자열로 바꾸라
					System.out.println("학번 중복");
					continue; // for 에서 continue 를 만나면 건너뛰어버림
					}
					// 나머지 경우 빈칸 검사
				}else if(str.isBlank()) {
					System.out.println("값을 입력해주세요");
					System.out.printf("%s 는 필수항목입니다.\n", item);
					continue;
				}
				inputStr[item.getIndex()] = str;
				break;
			}
		} 
		StudentDto stDto = new StudentDto();
		stDto.num = inputStr[StdIndex.학번.getIndex()];
		stDto.name = inputStr[StdIndex.이름.getIndex()];
		stDto.dept = inputStr[StdIndex.학과.getIndex()];
		stDto.grade = inputStr[StdIndex.학년.getIndex()];
		stDto.tel = inputStr[StdIndex.전화번호.getIndex()];
		stDto.addr = inputStr[StdIndex.주소.getIndex()];
		students.add(stDto);
		return true;
	}

	@Override
	public void inputStudents() {
		//TODO: 여러 학생 정보 입력받기
//		while (true) {
//			if (this.inpuStudent()) {
//				break;
//			}
//		}
		boolean result = true;
		while (result) {
			Line.sLine(100);
			result = this.inputStudent();
			Line.sLine(100);
		}
		System.out.println("입력 끝!");
	}

	@Override
	public void loadStudent() {
		// TODO 학생정보 읽어오기

	}

	@Override
	public void printStudent() {
		//TODO: 학생 정보 출력하기
		Line.dLine(100);
		System.out.println("한울고교 학생정보");
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		Line.sLine(100);

		for (StudentDto dto : students) {
			System.out.printf("%s\t", dto.num);
			System.out.printf("%s\t", dto.name);
			System.out.printf("%s\t", dto.dept);
			System.out.printf("%s\t", dto.grade);
			System.out.printf("%s\t", dto.tel);
			System.out.printf("%s\n", dto.addr);
		}
		Line.dLine(100);
	}

	@Override
	public void saveStudent() {
		// TODO Auto-generated method stub
		
	}

}
