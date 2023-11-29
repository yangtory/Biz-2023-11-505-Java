package com.callor.arrays;

public class ArraysE {

	public static void main(String[] args) {

		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEng = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];

		int[] sums = new int[STUDENT_LENGTH];
		float[] avgs = new float[STUDENT_LENGTH];

		int[] totals = new int[3];
		int allTotal = 0;
		float[] avgTotals = new float[3];
		float[] allAvg = 0.0;
		

		// 점수 만들기
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] = (int) (Math.random() * 50) + 51;
			totals[0] += scoreKors[i];
			avgTotals[0] = (float)totals[0] / STUDENT_LENGTH;
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			scoreEng[i] = (int) (Math.random() * 50) + 51;
			totals[1] += scoreEng[i];
			avgTotals[1] = (float)totals[1] / STUDENT_LENGTH;
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			scoreMath[i] = (int) (Math.random() * 50) + 51;
			totals[2] += scoreMath[i];
			avgTotals[2] = (float)totals[2] / STUDENT_LENGTH;
		}

		// 총점, 평균 만들기
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sums[i] = scoreKors[i];
			sums[i] += scoreEng[i];
			sums[i] += scoreMath[i];
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			avgs[i] = (float) sums[i] / 3;
		}

		// 과목별 합계 만드기
		for (int i = 0; i < STUDENT_LENGTH; i++) {
		allTotal += sums[i];
		}
				
		// 춣력
		System.out.println("=".repeat(80));
		System.out.println(" 샛별반 성적표");
		System.out.println("-".repeat(80));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));

		for (int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%3d\t", i + 1);
			System.out.printf("%3d\t", scoreKors[i]);
			System.out.printf("%3d\t", scoreEng[i]);
			System.out.printf("%3d\t", scoreMath[i]);
			System.out.printf("%4d\t", sums[i]);
			System.out.printf("%5.2f\n", avgs[i]);
		}
		System.out.println("-".repeat(80));
		System.out.printf("\t%3d\t%3d\t%3d\t%3d\n", totals[0], totals[1], totals[2], allTotal);
		System.out.printf("\t%5.2f\t%5.2f\t%5.2f\n", avgTotals[0], avgTotals[1], avgTotals[2], allAvg);
		System.out.println("=".repeat(80));
		}
	}


