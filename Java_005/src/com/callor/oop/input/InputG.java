package com.callor.oop.input;

import java.util.Scanner;

public class InputG {

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("정수 (QUIT:종료) >> ");
			String str = scan.nextLine();
			if (str.equals("QUIT"))
				break;

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정확한 값을 입력하세요");
				System.out.println("입력한 값 : " + num);
				continue;
			}
			if (num < 2) {
				System.out.println("값은 2 이상 입력하세요");
				System.out.println("입력한 값 : " + num);
			}
			if (num % 2 == 0) {
				System.out.println("짝수입니다");
				System.out.println("입력한 값 : " + num);
			} else {
				System.out.println("짝수가 아닙니다");
			}
			int i = 0;
			for (i = 0; i < num; i++) {
				if (num % 2 == 0) {
					break;
				}
			}
			if (i < num) {
				System.out.printf("  %d 는 소수가 아님\n", num);
			} else {
				System.out.printf("  %d 는 소수임\n", num);
			}
		}
	}

}
