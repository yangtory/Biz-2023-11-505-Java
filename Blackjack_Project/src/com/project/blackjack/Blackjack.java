package com.project.blackjack;

import java.util.List;

import com.project.blackjack.model.BlackjackDto;
import com.project.blackjack.service.BlackjackService;

public class Blackjack {
	
	public static void main(String[] args) {
		BlackjackService service = new BlackjackService();
		BlackjackDto dto = new BlackjackDto();
		
		service.makeDeck();
		List<BlackjackDto>deckList = service.getDeck();
		
		for(BlackjackDto blackDto : deckList ) {
			System.out.println(blackDto);
		}

	}

}
