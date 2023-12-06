package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersBA {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("숫자를");
		
		for(int main = 0 ; main < num ; main++) {
			System.out.printf("%3d",main);
			for(int sub = 0; sub < main+1 ; sub++) {
				System.out.printf("%3d",sub);
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
