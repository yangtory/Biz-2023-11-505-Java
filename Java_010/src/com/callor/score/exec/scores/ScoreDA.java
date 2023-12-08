package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreDA {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		List<ScoreDto>scores = new ArrayList<ScoreDto>();
		
		for(int i = 0 ; i < 3 ; i++) {
			String stdNum = String.format("S%04d", i+1);
			
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.stdNum = stdNum;
		}
		System.out.println("학번\t국어\t영어\t수학\t총점");
		int size = scores.size(); // 변수 선언하면 매번 size()가 size 를 확인하지 않는다 
		for(int i = 0 ; i < size ; i++) {
			ScoreDto dto = scores.get(i); //여기까지 두줄을 밑에거 처럼 줄일수 있음
			System.out.printf("%s\t",dto.stdNum);
			System.out.printf("%d\t",dto.kor);
			System.out.printf("%4d\t",dto.getTotal());
		}
		
		// scores 를 나열하고 dto에 집어넣기, 배열,리스트에 많이씀
		// 확장 for(forEach) : 배열, List 전체 요소를
		// 출력하거나, 연산할때 사용하는 새로운 for
		for(ScoreDto dto : scores) {
			System.out.printf("%s\t",dto.stdNum);
			System.out.printf("%3d\t",dto.kor);
			System.out.printf("%4d\t",dto.getTotal());
		}
	}
}
