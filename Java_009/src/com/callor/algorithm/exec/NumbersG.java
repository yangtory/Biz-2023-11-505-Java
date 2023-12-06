package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersG {
	// 정수 1개 입력받기
	// 점수에 대해 평점 출력
	// 80이상 축하합니다, 70~79 더분발하세요, 60미만 낙제입니다 출력
	public static void main(String[] args) {
		NumberService numService = new NumberService();

		Line.dLine(30);
		int num = numService.inputNum("점수를");
		Line.sLine(30);
		if (num < 60)System.out.println("F 입니다\n낙제입니다");
		else if (num < 65) System.out.println("D 입니다");
		else if (num < 70) System.out.println("D+ 입니다");
		else if (num < 75) System.out.println("C 입니다 \n더 분발하세요");
		else if (num < 80) System.out.println("C+ 입니다 \n더 분발하세요");
		else if (num < 85) System.out.println("B 입니다 \n축하합니다");
		else if (num < 90) System.out.println("B+ 입니다 \n축하합니다");
		else if (num < 95) System.out.println("A 입니다 \n축하합니다");
		else if (num <= 100) System.out.println("A+ 입니다 \n축하합니다");
		Line.dLine(30);
	}
}
