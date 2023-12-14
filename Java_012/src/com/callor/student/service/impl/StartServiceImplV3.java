package com.callor.student.service.impl;

import com.callor.student.models.MenuIndex;
import com.callor.student.service.StudentService;

public class StartServiceImplV3 extends StartServiceImplV2 {

	public StartServiceImplV3(StudentService stService) {
		// 상속받은 StartServiceImplV2 의 생성자를 호출하기
		super(stService);
		// this.stService = stService; 2에서 받아오는거라 수퍼에만 쓰면됨 
		
	}

	// App 이 시작되면 student.txt 파일에 저장된 학생정보를 가져오기
	// 가져온 학생 정보는 students 에 보관하기 
	@Override
	public void startApp() {
		stService.loadStudent();
		while (true) {
			Integer selectMenu = this.selectMenu();
			if (selectMenu == null)
				break;
			else if (selectMenu == MenuIndex.학생정보_입력.getIndex()) {
				// System.out.println("학생정보 입력");
				stService.inputStudents();
				// 입력이 끝나면 저장
				stService.saveStudent();
				
			} else if (selectMenu == MenuIndex.학생정보_조회.getIndex()) {
				System.out.println("학생정보 조회");
				
			} else if (selectMenu == MenuIndex.학생정보_가져오기.getIndex()) {
				System.out.println("학생정보 가져오기");
				stService.loadStudent();
				
			} else if (selectMenu == MenuIndex.학생정보_출력.getIndex()) {
				// System.out.println("학생정보 출력");
				stService.printStudent();
				
			} else if(selectMenu == MenuIndex.학생정보_저장.getIndex()) {
				//System.out.println("학생정보 저장하기");
				stService.saveStudent();
			}// end if
		} // end while
		// 업무가 종료되면 
		// students 에 보관중인 데이터를 student.txt 파일에 저장해야 한다
		stService.saveStudent();
		System.out.println("업무 끝!");
	}// end startApp

}
