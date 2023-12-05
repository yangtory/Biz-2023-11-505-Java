package com.callor.score.exec;

import com.callor.score.model.ScoreDto;

public class ScoreA {
	
	public static void main(String[] args) {
		// ScoreA 에서 ScoreDto 클래스에 선언된 변수들을 
		// 사용하여 정보처리를 하기위해 score 객체로 선언하기
		// 생성자(new ScoreDto())를 사용하여 score 객체를
		// 초기화 한다(인스턴스 화(化) 한다)
		ScoreDto score = new ScoreDto();
		
		// 객체를 통해서 변수를 사용
		score.stdNum = "0001";
		score.kor = 80;
		score.eng = 90;
		score.math = 80;
		
		// private 는 객체변수를 통해 직접 읽어올수 없다
		//score.total = 100;
		//score.avg = 200;
		
	}
	
	
	

}
