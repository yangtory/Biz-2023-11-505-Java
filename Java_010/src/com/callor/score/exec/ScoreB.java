package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreB {

	public static void main(String[] args) {
		NumberService numSerivce = new NumberService();
		ScoreDto scoreDto = new ScoreDto();

		// 3개를 입력해야 하니까 변수 선언해버리기
		int start = 50;
		int end = 100;
		for (int i = 0; i < 3; i++) {
			scoreDto.kor = numSerivce.inputNumber("국어 점수를", start, end);
			scoreDto.eng = numSerivce.inputNumber("영어 점수를", start, end);
			scoreDto.math = numSerivce.inputNumber("수학 점수를", start, end);
		}
		
		int total = scoreDto.getTotal();
		System.out.printf("총점 : %d\n", total);
	}

}
