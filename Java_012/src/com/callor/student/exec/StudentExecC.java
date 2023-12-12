package com.callor.student.exec;

import com.callor.student.models.Stindex;

public class StudentExecC {
	
	public static void main(String[] args) {
		// Stindex 에 잇는 학번은 몇번이야?
		System.out.println(Stindex.학번.getIndex());
		System.out.println(Stindex.이름.getIndex());
	}
}
