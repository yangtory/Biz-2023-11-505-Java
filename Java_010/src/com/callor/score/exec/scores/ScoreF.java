package com.callor.score.exec.scores;

import com.callor.score.service.ScoreService;

public class ScoreF {

	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		// 3명의 학생 점수를 입력받아 scoreService.scores 에
		// 추가해달라
		for (int i = 0; i < 3; i++) {
			scoreService.inputScore(); // 3명의 학생의 3과목점수가 scores 에 저장된 상태
		}
		// scoreService.scores 에 저장된 학생 성적정보를
		// 출력해달라
		scoreService.printScore();

//		while (true) {} // main이 끝나도 기다리세여, terminate 를 누르지 않으면 초기화 안됨
	}

}
