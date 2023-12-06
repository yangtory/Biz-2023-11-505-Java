package com.project.blackjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.project.blackjack.model.BlackjackDto;

public class BlackjackService {

	String suit = "♣,◆,♠,♥";
	String denomi = "A,2,3,4,5,6,7,8,9,10,K,Q,J";
	private List<BlackjackDto>deckList;
	
	public BlackjackService() {
		deckList = new ArrayList<BlackjackDto>();
	}
	public List<BlackjackDto>getDeck(){
		return deckList; //게임에서 쓸 덱 
	}
	
	public void makeDeck() {
		String[]suits = suit.split(",");
		String[]denomis = denomi.split(",");
		
		for (String suit : suits) {
			for(String denomi : denomis) {
				int cardValue =0;
				try {
					cardValue = Integer.valueOf(denomi);
				} catch (Exception e) {
					if(denomi.equals("A")) {
						cardValue = 1;
					}else cardValue = 10;
				}
				BlackjackDto blackjackDeck = new BlackjackDto();
				blackjackDeck.setCardSuit(suit);
				blackjackDeck.setDenomi(denomi);
				blackjackDeck.setValue(cardValue);
				deckList.add(blackjackDeck);
			}
		}// end for
		Collections.shuffle(deckList); // 카드섞
		Collections.shuffle(deckList);
	}
	
}
