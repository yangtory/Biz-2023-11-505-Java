package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;

public class ListA {
	
	public static void main(String[] args) {
		List<ScoreDto>scores = new ArrayList<ScoreDto>();
		ScoreDto scoreDto = new ScoreDto();
		
		// 어떤 값을 문자열로 바꿔서 보여주는
		System.out.println(scores.toString());
		System.out.println(scoreDto.toString());
		
		for(int i = 0 ; i < 10 ; i++) {
			scoreDto = new ScoreDto();// 이거 추가해야 주소가 달라짐
			scores.add(scoreDto);
		}
		System.out.println(scores.toString());
	}

}
