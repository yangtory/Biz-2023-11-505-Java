package com.callor.blackjack.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.service.PlayerService;

public class PlayerServiceImplV1 implements PlayerService {
	// protected 로 바꿔줘야 V2 에서 카드 리스트를 상속받아 쓸수 있음
	protected List<CardDto> myCardList = null;
	protected String playerName = "";
	
	/*
	 * PlayerService 딜러 = new PlayerServiceImplV1() 처럼 생성하면
	 * 		playerName 을 "딜러" 라는 값을 할당하라
	 */
	public PlayerServiceImplV1() { // 매개변수가 없는 기본 생성자
		// new PlayerServiceImplV1("딜러") 처럼 호출하기
		this("딜러");
	}
	
	public PlayerServiceImplV1(String playerName) {
		myCardList = new ArrayList<CardDto>();
		this.playerName = playerName;
	}

	@Override
	public void hit(CardDto card) {
		myCardList.add(card);
	}

	@Override
	public void showCard() {
		for (CardDto dto : myCardList) { // 가지고 있는 카드 개수만큼 반복하면서
			for (String p : dto.getPatterns()) { // 패턴을 가져옴
				System.out.println(p);
			}
		}
	}

	@Override
	public int getScore() {
		int score = 0;
		for (CardDto dto : myCardList) {
			score += dto.value;
		}
		return score;
	}

}
