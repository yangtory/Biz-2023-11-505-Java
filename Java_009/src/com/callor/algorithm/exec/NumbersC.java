package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;
//삼각형 거꾸로 찍기
public class NumbersC {

	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(30);
		int num = numService.inputNum("숫자를");
		Line.sLine(30);

		for (int main = 0; main < num; main++) {
			for (int sub = num; sub > main; sub--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		Line.dLine(30);
	}
}
