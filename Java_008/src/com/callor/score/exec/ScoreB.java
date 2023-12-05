package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.ScoreServiceA;

public class ScoreB {
	
	public static void main(String[] args) {
		ScoreServiceA scoreService = new ScoreServiceA(); // new ..() 생성자메서드, 클래스를 객체로 초기화
		scoreService.loadScores();
		scoreService.printScores();
	}

}
