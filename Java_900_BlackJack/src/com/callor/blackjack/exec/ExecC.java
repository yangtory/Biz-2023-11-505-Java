package com.callor.blackjack.exec;

import java.util.Scanner;

import com.callor.blackjack.impl.CardServiceImplV1;
import com.callor.blackjack.service.CardService;

public class ExecC {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CardService cardService = new CardServiceImplV1();
		// cardService.makeCardDeck();
		
		while(true) {
			System.out.println(cardService.getCard());
			System.out.println("아무키나 누르세요....");
			scan.nextLine();
		}
	}

}
