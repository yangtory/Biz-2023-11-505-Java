package com.callor.oop.Keyboard;

import java.util.Scanner;

public class KeyboardDA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int rndNum = (int) (Math.random() * 50) + 2;

		// 게임 메서드 불러오기
		KeyboardD.game(num, rndNum);

		// 게임 재시작, 종료
		while (true) {
			String str1 = scan.nextLine();
			if (str1.equals("좋아요")) {
				KeyboardD.game(num, rndNum);
			}
			if (str1.equals("싫어요")) {
				System.out.println(" 게임 종료 !");
			}
			try {
				num = Integer.valueOf(str1);
			} catch (Exception e) {
				System.out.println("좋아요, 싫어요 만 입력하세요");
				continue;
			}
		}
	}
}
