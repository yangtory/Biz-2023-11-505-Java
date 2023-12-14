package com.callor.student.service.impl;

import com.callor.student.models.StdIndex;
import com.callor.student.models.StudentDto;

public class StudentServiceImplV3 extends StudentServiceImplV2 {

	public StudentServiceImplV3() {
		super();
	}
	
	@Override
	public boolean inputStudent() {
		String[] inputStr = new String[StdIndex.values().length];
		
		for (StdIndex item : StdIndex.values()) {
			while (true) {
				System.out.printf("(%s)", students.get(students.size()-1).num );
				System.out.printf("%s 입력(QUIT : 종료) >> ", item);
				String str = keyBD.nextLine();
				if (str.equals("QUIT"))
					return false;
				if (item.toString().equals("학번") && this.selectStdNum(str) != null) { // toString 문자열로 바꾸라
					System.out.println("학번 중복");
					continue; // for 에서 continue 를 만나면 건너뛰어버림
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


}
