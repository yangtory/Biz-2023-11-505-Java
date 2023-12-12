package com.callor.student.service;

import java.util.Scanner;
import com.callor.student.utils.Line;

public class StartService {
	private StudentServiceV3 stService = null;
	private String[] menuItems = null;
	private Scanner scan = null;

	public StartService() {
		scan = new Scanner(System.in);
		menuItems = new String[] {
				"1. 학생정보 입력",	
				"2. 학생정보 가져오기",	
				"3. 학생정보 조회",	
				"4. 학생정보 출력"
		}; //세미콜론 찍어주기
		stService = new StudentServiceV3();
	}

	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
//		System.out.println("1. 학생정보 입력");
//		System.out.println("2. 학생정보 조회");
//		System.out.println("3. 학생정보 출력");
		for(String item : menuItems) {
			System.out.println(item);
		}
		System.out.println("QUIT. 종료");
		Line.sLine(50);
	}

	public int selectMenu() {
		while (true) {
			this.mainMenu();
			System.out.print("업무 선택 >> ");
			String strNum = scan.nextLine();
			int intNum = 0;
			if(strNum.equals("QUIT")) {
				System.out.println("업무 끝!!");
				return -1;
			}
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("정수로 입력해주세요");
				continue;
			}
			if(intNum < 1 || intNum > menuItems.length) {
				System.out.printf("1 ~ %d 까지 입력하세요\n", menuItems.length );
				continue;
			}
			// 여기에 코드가 다다르면
			// 정상적으로 업무를 선택했다는 것
			return intNum;
		}
	}// end selectMenu()
	
	public void startApp() {
		while(true) {
			int menuId = this.selectMenu();
			if(menuId == -1) {
				break;
			} else if(menuId == 1) { // 학생정보 입력
				stService.inputStudents();
			} else if(menuId == 2) { // 학생정보 가져오기
				stService.loadStudent();
			} else if(menuId == 4) { // 학생정보 출력
				stService.printStudent();
			}
		}
	}
}
