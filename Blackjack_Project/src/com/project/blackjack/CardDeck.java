package com.project.blackjack;

import com.project.blackjack.model.BlackjackDto;
import com.project.blackjack.service.BlackjackService;

public class CardDeck {
	BlackjackService blackService = new BlackjackService();
	
	public CardDeck() {
		blackService.getDeck();
	}

}
