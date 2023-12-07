package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreC {

	public static void main(String[] args) {
		NumberService numService = new NumberService();
		ScoreDto scoreDto = new ScoreDto();
		List<ScoreDto> scores = new ArrayList<>();

		int start = 50;
		int end = 100;
		int total = 0;
		
		for (int i = 0; i < scores.size() ; i++) {
			ScoreDto std = scores.get(i);
			scoreDto.kor = numService.inputNumber("국어점수", start, end);
			scoreDto.eng = numService.inputNumber("영어점수", start, end);
			scoreDto.math = numService.inputNumber("수학점수", start, end);
			total = scoreDto.getTotal();
		}
		System.out.println(scores);
		
		for(int i = 0 ; i < 3 ; i++) {
		
		}
		
	}

}
