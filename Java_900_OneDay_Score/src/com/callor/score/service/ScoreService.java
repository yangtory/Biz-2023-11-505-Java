package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreService {

	// 선언
	private List<ScoreDto> scores = null;
	private ScoreDto total = null;

	// 초기화
	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
		total = new ScoreDto();
	}

	// 10명의 학생 학번 만들고 점수 random() 으로 만들어 dto 에 넣기
	public void inputScore(int students) {
		String strStdNum = "23000"; // 최초값
		for (int i = 0; i < students; i++) {

			// 학번
			int intStdNum = Integer.valueOf(strStdNum.substring(2));
			intStdNum++;
			strStdNum = String.format("23%04d", intStdNum);

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
			total.kortotal += scoreDto.scorekor;
			total.engtotal += scoreDto.scoreeng;
			total.mathtotal += scoreDto.scoremath;
			total.musictotal += scoreDto.scoremusic;
			total.arttotal += scoreDto.scoreart;
			total.totalTotal += scoreDto.getTotal();

			// 과목별 평균
			total.koravg = total.kortotal / students;
			total.engavg = total.engtotal / students;
			total.mathavg = total.mathtotal / students;
			total.musicavg = total.musictotal / students;
			total.artavg = total.arttotal / students;
			total.totalavg = total.totalTotal / students;
		} // end for
	}// end input

	public void printScore() {
		ScoreService service = new ScoreService();
		Line.dLine(70);
		System.out.println("*한울 고교 새별 반 성적 리스트 *");
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
		ScoreDto dto = new ScoreDto();
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\t%d\n", total.kortotal, total.engtotal, total.mathtotal,
				total.musictotal, total.arttotal, total.totalTotal);
		System.out.printf("평균\t%5.2f\t%5.2f\t%5.2f\t%5.2f\t%5.2f\t\t%5.2f\n", total.koravg, total.engavg, total.mathavg,
				total.musicavg, total.artavg, total.totalavg);
		Line.dLine(70);
	}

}
