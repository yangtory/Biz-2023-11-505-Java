package com.callor.student.service.impl;

import com.callor.student.models.MenuIndex;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

public class StartServiceImplV2 extends StartServiceImplV1 {
	public StartServiceImplV2(StudentService stService) {
		// scan = new Scanner(System.in);
		// V1 의 생성자를 호출하여 V1 생성자에 있는
		// 코드를 그대로 실행하겠다
		super(stService); // 수퍼() 이친구는 항상 생성자 제일 첫번째로 있어야함
		// ImpV1 에서는 St...serivceImpV1 을 사용하여
		// stService 를 초기화 하였다
		// 하지만 여기에서는 ImplV2 를 사용하고 싶다
		// 그럴때는 다시 stService 를 ImpV2 로 초기화 하면된다
		// stService = new StudentServiceImplV2();
	}
	
	@Override
	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울 고교 학생정보 관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		
		for(MenuIndex menu : MenuIndex.values()) {
			String item = menu.toString();
			item = item.replace("_", " "); // 아이템 문자열에 _를 공백으로 바꿔
			System.out.printf("%d. %s\n", menu.getIndex(), item);
		}
		System.out.println("QUIT. 종료");
		Line.sLine(50);
	} // end mainMenu()
	
	@Override
	public Integer selectMenu() {
		Integer selectMenu = 0;
		while(true) {
			this.mainMenu();
			System.out.print("업무 선택 >> ");
			String str = scan.nextLine();
			if(str.equals("QUIT")) return null; //Integer 를 사용한 이유, null을 리턴하기위해 
			try {
				selectMenu = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("업무 선택은 정수값을 입력하세요");
				continue;
			}
			if(selectMenu < 1 || selectMenu > MenuIndex.values().length ) {
				System.out.printf("업무 선택은 1 ~ %d 범위의 값입니다\n", MenuIndex.values().length);
				continue;
			}
			return selectMenu;
		}
	}// end selectMenu()
	
	@Override
	public void startApp() {
		while(true) {
			Integer selectMenu = this.selectMenu();
			if(selectMenu == null) break;
			else if(selectMenu == MenuIndex.학생정보_입력.getIndex()) {
				//System.out.println("학생정보 입력");
				stService.inputStudents();
			} else if(selectMenu == MenuIndex.학생정보_조회.getIndex()) {
				System.out.println("학생정보 조회");
			} else if(selectMenu == MenuIndex.학생정보_가져오기.getIndex()) {
				System.out.println("학생정보 가져오기");
			} else if(selectMenu == MenuIndex.학생정보_출력.getIndex()) {
				//System.out.println("학생정보 출력");
				stService.printStudent();
			}
		} // end while
		System.out.println("업무 끝!");
	}// end startApp
}
