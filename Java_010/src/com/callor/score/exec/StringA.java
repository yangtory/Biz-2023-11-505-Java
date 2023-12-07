package com.callor.score.exec;

public class StringA {

	//printf 는 void 타입임
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int num = i + 1;
			String stNum = System.out.printf("S%05d\n",num); 

		}
	}

}
