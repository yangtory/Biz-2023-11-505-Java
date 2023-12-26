package com.callor.blackjack.impl;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.utils.AnsiConsol;
import com.callor.blackjack.utils.Line;

public class PlayerServiceImplV2 extends PlayerServiceImplV1 {

	public PlayerServiceImplV2() {
		super("딜러");
	}
	public PlayerServiceImplV2(String playerName) {
		super(playerName);
	}

	@Override
	public void showCard() {

		if (myCardList.isEmpty()) {
			System.out.println("현재 보유중인 카드 없음");
			return;
		}
		Line.dLine(100);
		System.out.printf("%s, 받은카드 : %d, %d점\n", 
				this.playerName, this.myCardList.size(), this.getScore());
		Line.sLine(100);
		
		// 카드 한장을 그리는데 필요한 라인 수
		int patternsCount = myCardList.get(0).getPatterns().length;
		for (int lines = 0; lines < patternsCount; lines++) { // 피벗 코드, 포문의 순서를 바꿔서 가로로 나열하기
			for (CardDto dto : myCardList) { // list 에서가져온 현재 카드를 가져와서

//				String line = dto.getPatterns()[lines]; // getPatterns()가 리턴한 값의 라인번째
				String line = String.format("%10s", dto.getPattern(lines));
				if("◆♣".contains(dto.suit)) {
					System.out.print(AnsiConsol.RED(line));
				}else {
					System.out.print(AnsiConsol.CYAN(line));
				}
			}
			System.out.println();
		}
	}
}
