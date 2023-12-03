package com.callor.oop.Keyboard;

import java.util.Scanner;

public class KeyboardBA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rndNum = (int) (Math.random() * 10) + 1;

		System.out.println("=".repeat(50));
		System.out.println("숫자 맞추기 게임");
		System.out.println("=".repeat(50));
		while (true) {
			System.out.println("1 ~ 10 까지 법위의 정수를 입력하세요");
			System.out.println("정수 >> ");
			String str = scan.nextLine();

			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.printf("입력한 값 : (%s)\n", str);
				continue;
			}
			if (num < 1 || num > 10) {
				System.out.println("1 ~ 10 까지 범위의 정수만 입력하세요");
				continue;
			}
			if (num == rndNum) {
				System.out.println("참 잘했어요 : " + num);
				break;
			} else if (num > rndNum) {
				System.out.println("입력한 값이 너무 커요");
//				continue; // 컨티뉴 필요없음, 빠져나가도 while 문임
			} else if (num < rndNum) {
				System.out.println("입력한 값이 너무 작아요");
//				continue;
			}
			System.out.println("다시 한번 잘 생각해 보세요");

		} // end while
		System.out.println("GAME OVER");
	}// end main

}
