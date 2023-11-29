package com.callor.scores;

import com.callor.service.ScoreService; //scoreService 클래스 꾸러미 데려오기 

public class ScoresA {
	
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = ScoreService.score(STUDENT_LENGTH); //점수 만드는거
		int[] scoreEngs = ScoreService.score(STUDENT_LENGTH);
		int[] scoreMaths = ScoreService.score(STUDENT_LENGTH);
		int[] scoreMusics = ScoreService.score(STUDENT_LENGTH);
		int[] scoreHiss = ScoreService.score(STUDENT_LENGTH);
		
		for(int i = 0 ; i < scoreKors.length ; i++) {
			System.out.printf("%3d\t", scoreKors[i]); // 점수 출력
			System.out.println(ScoreService.gradeScore(scoreKors[i])); // 등급 만들고 출력
		}
	}

}
