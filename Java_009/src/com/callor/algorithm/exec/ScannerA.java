package com.callor.algorithm.exec;

import java.util.Scanner;

public class ScannerA {
	// 스캐너 클래스를 사용하여 키보드에서 2개의 정수 입력받기
	// 입력받은 2개의 정수의 4칙연산과 나머지 연산 수행해서 console 에 출력하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("=".repeat(30));
		System.out.print("첫번째 정수를 입력하세요 >> ");
		String str1 = scan.nextLine();
		num1 = Integer.valueOf(str1);
		
		System.out.print("두번째 정수를 입력하세요 >> ");
		String str2 = scan.nextLine();
		num2 = Integer.valueOf(str2);
		System.out.println("-".repeat(30));
		
		System.out.printf("%d + %d = %d \n", num1,num2, num1+num2);
		System.out.printf("%d - %d = %d \n", num1,num2, num1-num2);
		System.out.printf("%d x %d = %d \n", num1,num2, num1*num2);
		System.out.printf("%d ÷ %d = %d \n", num1,num2, num1/num2);
		System.out.printf("%d MOD %d = %d ", num1,num2, num1%num2);
		System.out.println("=".repeat(30));
		
		
		
		
		
	}

}
