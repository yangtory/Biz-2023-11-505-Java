package com.callor.opp.exec;

import com.callor.opp.service.ScoreService;

public class ScoreCA {
	
	public static void main(String[] args) {
		ScoreService[] scores = new ScoreService[10];
		scores[0] = new ScoreService();
		
		for(int i = 0 ; i < scores.length ; i++) { //배열.length 를 사용하자
			scores[i] = new ScoreService();
		}
		
		//10개의 배열의 각 과목점수를 random 으로 생성하고자 한다
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i].scoreKor = (int)(Math.random() * 50 )+51;
			scores[i].scoreEng = (int)(Math.random() * 50 )+51;
			scores[i].scoreMath = (int)(Math.random() * 50 )+51;
		}
	}

}
