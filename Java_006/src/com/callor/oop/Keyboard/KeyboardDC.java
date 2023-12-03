package com.callor.oop.Keyboard;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class KeyboardDC {
	//while문 2개 써서 만들어보기

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean restart = true;

		while (restart) {
			int num = 0;
			int rndNum = (int) (Math.random() * 10);
			int i = 0; // 시도한 횟수 세기

			while (true) {
				System.out.println("=".repeat(30));
				System.out.println("숫자 맞추기 ");
				
				System.out.print("정수 >> ");
				String str = scan.nextLine();
				
				// 정수가 아닌 값
				try {
					num = Integer.valueOf(str);
				} catch (Exception e) {
					System.out.println("정수를 입력하세요");
					continue;
				}

				// 10까지의 정수만 받기
				if (num <= 1 || num > 10) {
					System.out.println("10 까지의 정수를 입력하세요");
					i++;
				}
				// 5회 카운트 
				if (i+1 == 5) {
					System.out.println(" 5 번째 못 맞춤 실패!");
					break;
				}

				// 맞췄을때, 그게아니면 큰지 작은지 검사
				if (num == rndNum) {
					System.out.println("참잘했어요 : " + num);
					System.out.printf("%d 번째에 맞췄어요!\n", i + 1);
					break;
				} else if (num > rndNum) {
					System.out.println("값이 너무 커요");
					i++;
					continue;
					
				} else if (num < rndNum) {
					System.out.println("값이 너무 작아요");
					i++;
					continue;
				}

			} // end while
			Line.dLine(50);
			System.out.print("게임을 계속 하려면 'y', 그만하려면 'n' 를 입력하세요. \n >> ");
			
			String str1 = scan.nextLine();
			if (str1.equals("y")) {
				continue;
			}
			if (str1.equals("n")) {
				System.out.println(" 게임 종료 !");
				break;
			}
			try {
				num = Integer.valueOf(str1);
			} catch (Exception e) {
				System.out.println("y, n 만 입력하세요");
				continue;
			}
		} // restart while
	}
}
