package com.callor.arrays;

public class ArraysD {

	public static void main(String[] args) {

		// 10개의 학생, 점수, 총점, 평균 만들기
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEng = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];
		int[] sum = new int[STUDENT_LENGTH];
		float[] avg = new float[STUDENT_LENGTH];

		// 각 과목 점수 만들기
		for (int i = 0; i < scoreKors.length; i++) {
			int rndKors = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndKors; //rndKors 만들필요가 없음
		}

		for (int i = 0; i < scoreEng.length; i++) {
			int rndEng = (int) (Math.random() * 50) + 51;
			scoreEng[i] = rndEng;
		}

		for (int i = 0; i < scoreMath.length; i++) {
			int rndMath = (int) (Math.random() * 50) + 51;
			scoreMath[i] = rndMath;
		}

		// 각 학생의 총점 만들기
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sum[i] = scoreKors[i] + scoreEng[i] + scoreMath[i];
		}

		// 각 학생의 평균 만들기
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			avg[i] = (float) sum[i] / 3;
		}

		// 출력하기
		System.out.println("=".repeat(30));
		System.out.println("        샛별반 성적표    ");
		System.out.println("-".repeat(30));
		System.out.println("국어  영어  수학  총점  평균");
		System.out.println("-".repeat(30));

		for (int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%3d   %3d   %3d   %3d   %5.2f\n", 
					scoreKors[i], scoreEng[i], scoreMath[i], sum[i], avg[i]);
		}

		System.out.println("=".repeat(30));
	}
}
