package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersH {

	public static void main(String[] args) {
		NumberService numService = new NumberService();

		int num1 = numService.inputNum("점수1 을");
		int num2 = numService.inputNum("점수2 를");
		int num3 = numService.inputNum("점수3 을");
		int sum = num1;
		sum += num2;
		sum += num3;
		int avg = sum / 3;

		Line.sLine(30);
		if (avg >= 60) System.out.println("합격입니다");
		else if (avg < 60) System.out.println("낙제입니다");
	}
}
