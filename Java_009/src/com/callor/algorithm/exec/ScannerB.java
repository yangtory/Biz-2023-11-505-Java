package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

// 스캐너 클래스를 사용해서 2개 정수 받기
// 2개 정수 4칙연산과 나머지 연산 출력
// 정수가 아닐 경우 메시지 표시, 다시 입력받기
public class ScannerB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		Line.dLine(50);
		while (true) {
			System.out.print("첫 번째 정수를 입력하세요 >> ");
			String str = scan.nextLine();

			try {
				num1 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("** 정수를 정확히 입력하여 주세요 **");
				continue;
			}
			break;
		}
		while(true) {
			System.out.print("두 번째 정수를 입력하세요 >> ");
			String str = scan.nextLine();
			try {
				num2 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("** 정수를 정확히 입력하여 주세요 **");
				continue;
			}
			break;
		}
		
		Line.sLine(50);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		Line.dLine(50);
	}
}
