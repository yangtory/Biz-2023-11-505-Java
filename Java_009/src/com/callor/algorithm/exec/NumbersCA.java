package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersCA {
	
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("숫자를");
		
		for(int main = 0; main < num ; main++) {
			System.out.printf("%3d",main);
			// main 0 일때 : sub = 0 ; sub < 7-0
			// main 1 일때 : sub = 1 ; sub < 7-1
			for(int sub = 0 ; sub < num - main ; sub++) {
				System.out.printf("%3d",sub);
			}
			System.out.println();
		}
		
		for(int main = 0; main < num ; main++) {
			// sub 7 ~ 0 : 7개
			// sub 7 ~ 1 : 6개
			// sub 7 ~ 2 : 5개
			for(int sub = num ; sub > main ; sub--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
