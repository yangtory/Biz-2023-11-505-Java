package com.callor.score.exec;

import com.callor.score.service.ScoreServiceB;

public class ScoreC {
	
	public static void main(String[] args) {
		
		// 서비스 코드를 변경하지 않고도 처리방법을 정할수 있다
		
		String data1 = "src/com/callor/score/service/data.txt";
		String data2 = "src/com/callor/score/service/data2.txt";
		String data3 = "src/com/callor/score/service/data3.txt";
		
		ScoreServiceB sService1 = new ScoreServiceB(data1);
		sService1.loadScores();
		sService1.countScore();
		sService1.printScore();
		
		ScoreServiceB sService2 = new ScoreServiceB(data2);
		sService2.loadScores();
		sService2.countScore();
		sService2.printScore();
		
		ScoreServiceB sService3 = new ScoreServiceB(data3);
		sService3.loadScores();
		sService3.countScore();
		sService3.printScore();
	}

}
