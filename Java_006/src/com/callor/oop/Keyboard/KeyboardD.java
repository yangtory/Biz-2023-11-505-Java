package com.callor.oop.Keyboard;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class KeyboardD {
	// 게임 메서드

	public static void game(int num1, int num2) {

		Scanner scan = new Scanner(System.in);
		int count = 0;
		Line.dLine(50);
		System.out.println("뤼팡의 황금열쇠를 찾아라!");
		System.out.println("* 기회는 5번! *");
		Line.dLine(50);
		System.out.println("1 ~ 50 까지의 숫자중 황금열쇠를 입력하세요");

		while (true) {
			System.out.print("황금 열쇠 >> ");
			String str = scan.nextLine();

			try {
				num1 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정확한 정수 값을 입력하세요");
				continue;
			}

			if (num1 < 1 || num1 > 50) {
				System.out.println("1 ~ 50 범위의 정수를 입력하세요");
				count++;
				continue;
			}
			if (num1 == num2) {
				System.out.printf("참잘했어요 : %d (황금열쇠 값) ", num1);
				System.out.printf("%d 번째에 맞췄어요!\n", count + 1);
				break;
			} else if (num1 > num2) {
				System.out.println("* 값이 너무 커요, 다시 입력해 보세요 ");
				count++;
			} else if (num1 < num2) {
				System.out.println("* 값이 너무 작아요, 다시 입력해 보세요 ");
				count++;
			}
			if (count == 5) {
				System.out.println("5 번째 못 맞춤 실패!");
				break;
			}

		} // end while
		Line.dLine(50);
		System.out.print("게임을 계속 하려면 '좋아요', 그만하려면 '싫어요' 를 입력하세요. \n >> ");
	}
}
