package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputG {

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			Line.dLine(30);
			System.out.print("정수 (QUIT:종료) >> ");
			
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				System.out.println("퇴근!");
				break;				
			}
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정확한 값을 입력하세요");
				System.out.println("입력한 값 : " + num);
				continue;
			}
			// 2 이상 출력 
			if (num < 2) {
				System.out.println("값은 2 이상 입력하세요");
				System.out.println("입력한 값 : " + num);
				continue;
			}
			// 짝수 검사 
			if (num % 2 == 0) {
				System.out.println("짝수입니다");
				System.out.println("입력한 값 : " + num);
			} else {
				System.out.println("짝수가 아닙니다");
				System.out.println("입력한 값 : " + num);
			}	
			// 소수 검사  
			int i = 0;
			for (i = 2; i < num ; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (i < num) {
				System.out.printf(" %d 는 소수가 아닙니다\n", num);
			} else {
				System.out.printf(" %d 는 소수입니다\n", num);
			}
			
		}// end while
	}//end main
}
