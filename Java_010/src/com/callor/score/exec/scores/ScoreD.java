package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreD {

	public static void main(String[] args) {
		NumberService numService = new NumberService();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();

		int start = 50;
		int end = 100;

		for (int i = 0; i < 3; i++) {
			ScoreDto scoreDto = new ScoreDto();
			int stdNum = i + 1;
			int scoreKor = numService.inputNumber(stdNum + "번의 국어점수", start, end);
			int scoreEng = numService.inputNumber(stdNum + "번의 국어점수", start, end);
			int scoreMath = numService.inputNumber(stdNum + "번의 국어점수", start, end);
			String std = String.format("S%05d", stdNum);
			
			scoreDto.stdNum = std;
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;

			scores.add(scoreDto);
		}
		
		Line.dLine(50);
		System.out.println("성적 리스트");
		Line.dLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점");
		Line.sLine(50);
		for (int i = 0; i < scores.size(); i++) {
			ScoreDto dto = scores.get(i);
			System.out.printf("%s\t",dto.stdNum);
			System.out.printf("%3d\t",dto.kor);
			System.out.printf("%3d\t",dto.eng);
			System.out.printf("%3d\t",dto.math);
			System.out.printf("%3d\n",dto.getTotal());
		}
		Line.dLine(50);
	}

}
