package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;

public class ScoreService {
	// 한 명의 점수 출력받고 dto 에 넣기
	
	private List<ScoreDto>scores = null;
	private NumberService numService = null;
	
	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
		numService = new NumberService();
	}
	
	public void inputScore() {
		int scoreKor = numService.inputNumber("국어점수");
		int scoreEng = numService.inputNumber("영어점수");
		int scoreMath = numService.inputNumber("수학점수");
		
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		
		scores.add(scoreDto);
	} // end inputScore()
	
	public void inputScore(int start, int end) {
		int scoreKor = numService.inputNumber("국어점수",start,end);
		int scoreEng = numService.inputNumber("영어점수",start,end);
		int scoreMath = numService.inputNumber("수학점수",start,end);
		
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		
		scores.add(scoreDto);
	}
}
