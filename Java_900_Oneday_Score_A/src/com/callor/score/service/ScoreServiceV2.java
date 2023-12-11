package com.callor.score.service;

import java.util.ArrayList;

import com.callor.score.models.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreServiceV2 extends ScoreServiceV1 {
	
	// 0~4까지 쓸수는 있는데 헷갈리니까 이름 지어줌 
	private static int 국어 = 0;
	private static int 영어 = 1;
	private static int 수학 = 2;
	private static int 음악 = 3;
	private static int 미술 = 4;
	
	private int[] totalScore = null; //int 에는 null 을 넣을수 없지만 배열이라 가능함
	
	public ScoreServiceV2() {
		scores = new ArrayList<ScoreDto>();
		totalScore = new int[5];
	}
	
	@Override
	public void printScore() {
		super.printScore(); //super 는 V1에있는 원래 printScore 	
		
		for(ScoreDto dto : scores) {
			totalScore[국어] += dto.kor;
			totalScore[영어] += dto.eng;
			totalScore[수학] += dto.math;
			totalScore[음악] += dto.music;
			totalScore[미술] += dto.art;
		}
		
		int allTotal = 0;
		System.out.print("총점\t");
		for(int score : totalScore) {
			System.out.printf("%4d\t",score);
			allTotal += score;
		}
		System.out.printf("%4d\n",allTotal);
		
		float allAvg = 0;
		System.out.print("평균\t");
		for(int score : totalScore) {
			float avg = (float)score / scores.size();
			System.out.printf("%.1f\t", avg);
			allAvg += avg;
		}
		System.out.printf("\t%.2f\n", allAvg / totalScore.length);
		Line.dLine(100);
	}
}
