package com.callor.score;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.ScoreService;
import com.callor.score.utils.Line;

public class Score한울 {
	
	public static void main(String[] args) {
		List<ScoreDto>scores = new ArrayList<ScoreDto>();
		ScoreService scoreService = new ScoreService();
		

		scoreService.inputScore(10);
		scoreService.printScore();

	}

}
