package com.callor.oop.input;

import java.util.Scanner;

public class InputE {

	public static void main(String[] args) {
		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);

		// str 하나씩 안만들어도됨 첫 줄만 String 해서 그대로 쓰기
		System.out.print(" 정수 1 >> ");
		String str1 = scan.nextLine();
		nums[0] = Integer.valueOf(str1);

		System.out.print(" 정수 2 >> ");
		String str2 = scan.nextLine();
		nums[1] = Integer.valueOf(str2);

		System.out.print(" 정수 3 >> ");
		String str3 = scan.nextLine();
		nums[2] = Integer.valueOf(str3);

		System.out.println("=".repeat(50));

		//for 문으로 출력하기^^...
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
	}
}
