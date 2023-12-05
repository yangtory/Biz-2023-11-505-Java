package com.project.blackjack;

import com.project.blackjack.service.BlackjackService;

public class Blackjack {
	
	public static void main(String[] args) {
		
		BlackjackService blackjackService = new BlackjackService();
		blackjackService.loadCard();
		blackjackService.printBlackjack();
	}

}
