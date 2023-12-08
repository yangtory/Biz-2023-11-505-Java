package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.model.ScoreTotalAvgDto;
import com.callor.score.utils.Line;

public class ScoreService {

	// 선언
	private List<ScoreDto> scores = null;
	private ScoreDto total = null;
	private ScoreTotalAvgDto totalAvg = null;

	// 초기화
	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
		total = new ScoreDto();
		totalAvg = new ScoreTotalAvgDto();
	}

	// 10명의 학생 학번 만들고 점수 random() 으로 만들어 dto 에 넣기
	public void inputScore(int students) {
		String strStdNum = "23000"; // 최초값
		for (int i = 0; i < students; i++) {

			// 학번
			int intStdNum = Integer.valueOf(strStdNum.substring(2));
			intStdNum++;
			strStdNum = String.format("23%03d", intStdNum);

			// 점수
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.scorekor = (int) (Math.random() * 50) + 51;
			scoreDto.scoreeng = (int) (Math.random() * 50) + 51;
			scoreDto.scoremath = (int) (Math.random() * 50) + 51;
			scoreDto.scoremusic = (int) (Math.random() * 50) + 51;
			scoreDto.scoreart = (int) (Math.random() * 50) + 51;
			scoreDto.stdNum = strStdNum;

			scores.add(scoreDto);
				
			// 과목별 총점
			totalAvg.kortotal += scoreDto.scorekor;
			totalAvg.engtotal += scoreDto.scoreeng;
			totalAvg.mathtotal += scoreDto.scoremath;
			totalAvg.musictotal += scoreDto.scoremusic;
			totalAvg.arttotal += scoreDto.scoreart;
			totalAvg.totalTotal += scoreDto.getTotal();

			// 과목별 평균
			totalAvg.koravg = totalAvg.kortotal / students;
			totalAvg.engavg = totalAvg.engtotal / students;
			totalAvg.mathavg = totalAvg.mathtotal / students;
			totalAvg.musicavg = totalAvg.musictotal / students;
			totalAvg.artavg = totalAvg.arttotal / students;
			totalAvg.totalavg = totalAvg.totalTotal / students;
		} // end for
	}// end input

	public void printScore() {
		ScoreService service = new ScoreService();
		Line.dLine(70);
		System.out.println("* 한울 고교 새별 반 성적 리스트 *");
		Line.dLine(70);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(70);
		
		for (ScoreDto dto : scores) {
			System.out.printf("%s\t", dto.stdNum);

			System.out.printf("%d\t", dto.scorekor);
			System.out.printf("%d\t", dto.scoreeng);
			System.out.printf("%d\t", dto.scoremath);
			System.out.printf("%d\t", dto.scoremusic);
			System.out.printf("%d\t", dto.scoreart);

			System.out.printf("%d\t", dto.getTotal());
			System.out.printf("%5.2f\n", dto.getAvg());
		}
		
		Line.sLine(70);
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\t%d\n", totalAvg.kortotal, totalAvg.engtotal, totalAvg.mathtotal,
				totalAvg.musictotal, totalAvg.arttotal, totalAvg.totalTotal);
		System.out.printf("평균\t%5.2f\t%5.2f\t%5.2f\t%5.2f\t%5.2f\t\t%5.2f\n", totalAvg.koravg, totalAvg.engavg, totalAvg.mathavg,
				totalAvg.musicavg, totalAvg.artavg, totalAvg.totalavg);
		Line.dLine(70);
	}

}
