package com.callor.oop.Keyboard;

import java.util.Scanner;

public class KeyboardC {

	// 랜덤 메소드 사용해서 1~10 까지 랜덤수 생성
	// 스캐너를 사용해서 1~10까지 입력받기
	// 결과값이 같으면 참잘했어요
	// 맞지 않으면 다시 한번 시도해 보세요 출력
	// 00 번째 정답 맞춤
	// 00 번째 정답 못 맞춤 실패
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
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
				i++;
				continue;
			}

			// 10까지의 정수만 받기
			if (num <= 1 || num > 11) {
				System.out.println("10 까지의 정수를 입력하세요");
				i++;
				continue;
			}

			// 맞췄을때, 그게아니면 큰지 작은지 검사
			if (num == rndNum) {
				System.out.println("참잘했어요 : " + num);
				System.out.printf("%d 번째에 맞췄어요!", i + 1);
				break;
			} else if (num > rndNum) {
				System.out.println("값이 너무 커요");
				i++;
			} else if (num < rndNum) { // 처음에 if 만 썼는데 esle if로 쓰면 좋음
				System.out.println("값이 너무 작아요");
				i++;
			}
			
			if ( i == 5) {
				System.out.println(" 5 번째 못 맞춤 실패!");
				break;
			}
			System.out.println("다시 한번 잘 생각해 보세요^^");
		}// end while
	}
}
