package com.callor.oop.Keyboard;

import java.util.Scanner;

public class KeyboardA {
	// Scanner 사용하여 10 이상의 정수 입력받기
	// 1부터 입력받은 정수까지의 범위의 수중 짝수만 찾아 console 에 출력

	public static void main(String[] args) {

		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 >> ");

		String str = scan.nextLine();
		num = Integer.valueOf(str);
		
		// 짝수 나열 못함
		for (int i = 0; i < num; i++) {
			if (num % 2 == 0) {
				System.out.print(num);
			}
		}
//		System.out.printf(" %d",num);
//		System.out.printf("1 ~ %d 까지 범위에서 짝수는?", num);

	}

}
