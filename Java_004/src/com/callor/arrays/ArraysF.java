package com.callor.arrays;

import javax.management.remote.SubjectDelegationPermission;

public class ArraysF {

	public static void main(String[] args) {

		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEng = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];

		int[] sums = new int[STUDENT_LENGTH];
		float[] avgs = new float[STUDENT_LENGTH];

		int[] totals = new int[3];

		// 점수 만들기
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] = (int) (Math.random() * 50) + 51;
			totals[0] += scoreKors[i];
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			scoreEng[i] = (int) (Math.random() * 50) + 51;
			totals[1] += scoreEng[i];
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			scoreMath[i] = (int) (Math.random() * 50) + 51;
			totals[2] += scoreMath[i];
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
		System.out.printf("\t%3d\t%3d\t%3d\n", totals[0], totals[1], totals[2]);
		System.out.println("=".repeat(80));
		}
	}


