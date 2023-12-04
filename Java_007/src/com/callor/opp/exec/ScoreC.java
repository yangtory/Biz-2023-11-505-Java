package com.callor.opp.exec;

import com.callor.opp.service.ScoreService;

public class ScoreC {
	// ScoreServie 클래스를 사용하여 scroes 배열을 10개 선언
	// score 배열의 각 요소를 생성자를 사용하여 초기화
	// 단 for() 반복문을 사용하여 초기화
	// 51 ~ 100까지의 임의수 3개 생성하고
	// 각 배열요소 kor,eng,math 에 할당
	public static void main(String[] args) {
		ScoreService[] scores = new ScoreService[10];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();
		}
		
		// 변수 선언 필요업듬

		for (int i = 0; i < scores.length; i++) {
			//scores[i].scoreKor 임
			scores[i].scoreKor = (int) (Math.random() * 50) + 51;
			scores[i].scoreEng = (int) (Math.random() * 50) + 51;
			scores[i].scoreMath = (int) (Math.random() * 50) + 51;
		}
		//배열에 저장된 점수 화면에 출력하기
	}
}
