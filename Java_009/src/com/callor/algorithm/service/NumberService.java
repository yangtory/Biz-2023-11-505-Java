package com.callor.algorithm.service;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class NumberService {

	// 클래스영역에 선언할때는 private 해주는게 좋다
	/*
	 * 현재 클래스의 여러 method 에서 Scanner 를 사용하여 키보드 입력을 받아야 한다 Scanner scan = null; 코드에
	 * 의해서 Scanner 를 선언을 했다 하지만 아직 사용할 준비가 되지 않아 scan.nextline() 등의 코드를 실행하면
	 * NullpointerException 이 발생한다 Exception 발생을 방지하기 위하여 scan.nextline() 코드를 실행하기
	 * 전에 scan 초기화 코드 "scan = new Scanner(System.in)" 을 실행하여 scan 을 사용할 준비를 해주어야 한다
	 * 
	 * 하지만 각각의 method 에서 scan 초기화 코드를 사용하면 코드의 중복이 발생하고, 여러번 키보드를 연결, 단절하는 현상이 발생한다
	 * 
	 * 이럴때는 현재 클래스(KeyinputService)의 생성자 method 에서 scan 초기화 코드를 작성해야 한다
	 */
	private Scanner scan = null;

	public NumberService() {
		scan = new Scanner(System.in);
	}

	public int inputNum(String title) {

		while (true) {
			System.out.print(title + " 입력해 주세요 >> ");
			String str = scan.nextLine();
			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.err.println("** 정수를 정확히 입력해 주세요 **");
				continue;
			}
			return num;
		}
	}

	public void printAlgebra(int num1, int num2) {
		Line.sLine(50);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		Line.dLine(50);
	}

}
