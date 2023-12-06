package com.project.blackjack;

import com.project.blackjack.model.BlackjackDto;

public class CardDeck {

	public CardDeck() {
		BlackjackDto loadCard = new BlackjackDto();
		int[] cardDeck = new int [52];
		int[] cardNum = new int [36];
		int[] cardSuit = new int [16];

		for (int i = 0; i < cardDeck.length; i++) {
			cardDeck[i] = i+1;
			System.out.println(cardDeck[i]);
		} // 카드 덱 52장
		for(int i = 0 ; i < cardNum.length ; i++) {
			cardNum[i] = i+2;
			System.out.println(cardNum[i]);
		} // 숫자 카드 36장
		for(int i = 0 ; i < cardSuit.length ; i++) {
			cardSuit[i] = i+1;
			System.out.println(cardSuit[i]);
		}// 패턴 카드 16장
		
		if(cardNum[0] == 1) {
			cardNum[0] = 
		}

	}
}
