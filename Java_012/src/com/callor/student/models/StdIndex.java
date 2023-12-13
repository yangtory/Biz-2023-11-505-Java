package com.callor.student.models;
/*
 * private static int 학번 = 0;
 * private static int 이름 = 1;
 * 
 * StIndex 라는 배열을 선언하고
 * 각 요소를
 *  	학번, 이름, 학과, 학년, 전화번호, 주소 라는 이름으로 선언
 *  그리고 각요소는 index 라는 값을 갖는다
 * 
 */

public enum StdIndex {
	학번(0), 이름(1), 학과(2), 학년(3), 전화번호(4), 주소(5) ; // 배열선언
	
	private int index;
	StdIndex(int index) { // 생성자
		this.index = index;	
	}
	
	//외부에서 쓸수있도록 만든 칭구
	public int getIndex() {
		return index;
	}
	
}
