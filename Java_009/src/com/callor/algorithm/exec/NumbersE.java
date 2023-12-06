package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;
// 구구단 2단 부터 9단까지 출력
// 구구단 결과 값이 짝수인 경우만 출력
public class NumbersE {

	public static void main(String[] args) {
		
		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i < 10; i++) {
				if ((dan * i) % 2 == 0) {
					System.out.printf(" %d x %d = %d \n", dan, i, dan * i);
				}
			}
		}
	}
}
