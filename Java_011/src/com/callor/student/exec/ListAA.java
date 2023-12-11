package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;
// 선생님꺼
public class ListAA {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10 ; i++) {
			int num = (int)(Math.random() * 50)+ 51;
			nums.add(num);
		}
		System.out.println(nums);
	}

}
