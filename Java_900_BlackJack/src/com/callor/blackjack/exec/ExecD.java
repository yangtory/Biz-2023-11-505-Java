package com.callor.blackjack.exec;

import com.callor.blackjack.impl.CardServiceImplV1;
import com.callor.blackjack.impl.PlayerServiceImplV2;
import com.callor.blackjack.service.CardService;
import com.callor.blackjack.service.PlayerService;

public class ExecD {

	public static void main(String[] args) {
		CardService cardService = new CardServiceImplV1(); // 카드 준비
		PlayerService 딜러 = new PlayerServiceImplV2(); // 리스트 하나씩 만들기, 매개변수에 아무것도 넣지 않으면 기본생성자
		PlayerService 타짜1 = new PlayerServiceImplV2("타짜1"); // 매개변수에 이름을 넣으면 매개변수가 있는 생성자를 사용
		PlayerService 타짜2 = new PlayerServiceImplV2("타짜2");

		for (int i = 0; i < 2; i++) {
			딜러.hit(cardService.getCard());
			타짜1.hit(cardService.getCard());
			타짜2.hit(cardService.getCard());
		}
		//System.out.println("딜러==================");
		딜러.showCard();
		//System.out.println("타짜1==================");
		타짜1.showCard();
		//System.out.println("타짜2==================");
		타짜2.showCard();

		if (딜러.getScore() > 타짜1.getScore() && 딜러.getScore() > 타짜2.getScore()) {
			System.out.printf("딜러 승 : %d\n", 딜러.getScore());
		} else if (타짜1.getScore() > 딜러.getScore() && 타짜1.getScore() > 타짜2.getScore()) {
			System.out.printf("타짜1 승 : %d\n", 타짜1.getScore());
		} else if (타짜2.getScore() > 딜러.getScore() && 타짜2.getScore() > 타짜1.getScore()) {
			System.out.printf("타짜2 승 : %d\n", 타짜2.getScore());
		} else {
			System.out.println("무승부");
		}
	}
}