package com.callor.student.exec;

import com.callor.student.models.StdIndex;

public class StudentExC {
	
	public static void main(String[] args) {
		// stdIndex 에 잇는 학번은 몇번이야?
		System.out.println(StdIndex.학번.getIndex());
		System.out.println(StdIndex.이름.getIndex());
		
		// stdIndex enum 에 선언된 요소들을 배열로 변환하고
		// indexArray 에 배열에 복사하라
		StdIndex[] indexArray = StdIndex.values();
		
		for (int i = 0 ; i < indexArray.length ; i++) {}
		// indexArray 펼쳐서 stdIndex 요소에 넣어라
		for(StdIndex item : indexArray) {
			System.out.printf("%d, %s\n", item.getIndex(),item);
		}
	}
}
