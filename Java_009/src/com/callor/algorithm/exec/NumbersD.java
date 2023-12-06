package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersD {

	public static void main(String[] args) {

		NumberService numService = new NumberService();

		Line.dLine(30);
		int i = 0;
		int num = numService.inputNum("숫자를");
		int sum = 0;
		
		for( i = 0 ; i >= 1000 ; i++) {
			sum += num;
			System.out.printf("%d 번 입력한 숫자 총 합 : %d", i, sum);
			
		}
	}

}
