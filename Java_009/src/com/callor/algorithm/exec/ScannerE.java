package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class ScannerE {
	public static void main(String[] args) {

		NumberService keyService = new NumberService();

		Line.dLine(50);
		int num = keyService.inputNum("원하는 구구단 단수를");
		Line.dLine(50);
		System.out.printf("\t\t%d 단 구구단\n", num);
		Line.sLine(50);

		for (int i = 0; i < 9; i++) {
			System.out.printf("\t\t%d x %d = %d\n", num, i + 1, num * (i + 1));
		}
		Line.dLine(50);
	}

}
