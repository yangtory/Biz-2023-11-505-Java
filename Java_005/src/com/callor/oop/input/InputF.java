package com.callor.oop.input;

import java.util.Scanner;

public class InputF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;

		while (true) {
			System.out.println("끝내려면 QUIT 입력하세요");
			System.out.println("정수 >> ");
			String str = scan.nextLine();

			if (str.equals("QUIT"))
				break;

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력하세요");
				continue;
			}

			if (num % 2 == 0) {
				System.out.println("짝수입니다");
			}
			if (num > 10) {
				System.out.println("10까지 입력하세요");
			}
		}
		System.out.println("짝수 찾기 끝!");
	}

}
