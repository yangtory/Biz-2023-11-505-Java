package com.callor.arrays;

public class ArraysG {

	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;

		int[] scoreKors = new int[STUDENT_LENGTH];

		// 점수만들기
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
			System.out.println(rndScore);
			if (rndScore < 60) {
				System.out.println("F");
			}

		}

	}
}
