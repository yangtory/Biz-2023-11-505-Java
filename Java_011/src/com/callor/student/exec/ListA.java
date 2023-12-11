package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListA {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();

		int num = 0;
		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random() * 50) + 51;
			nums.add(num);
		}
		
		int size = nums.size();
		for (int index = 0; index < size; index++) {
			if (nums.get(index) == 77) {
				System.out.println(index + 1 + "번째 발견!");
				System.out.println("있다");
			}
		} // end for
		int index = 0;
		for(index = 0 ; index < size ; index++) {
			if(nums.get(index)==77) {
				break;
			}
		}
		if (index < size) {
			System.out.println(index+1 + "번째 발견!");
		} else {	
			System.out.println("없다");
		}
		System.out.println(nums);

	}
}
