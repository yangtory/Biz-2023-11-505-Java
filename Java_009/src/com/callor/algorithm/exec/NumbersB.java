package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

// * 삼각형 모양으로 찍기
public class NumbersB {

	public static void main(String[] args) {
		NumberService numService = new NumberService();

		Line.dLine(30);
		int num = numService.inputNum("숫자를");
		Line.sLine(30);
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		Line.dLine(30);
	}

}
