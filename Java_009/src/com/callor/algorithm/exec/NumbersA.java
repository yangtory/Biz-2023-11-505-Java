package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersA {

	// while 문으로 정수 1~10 까지 숫자를 출력
	public static void main(String[] args) {

		int num = 1;
		Line.dLine(100);
		while (num < 11) {
			System.out.printf("%d \t",num++);
		}
		System.out.println();
		Line.dLine(100);
	}

}
