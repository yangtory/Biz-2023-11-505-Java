package com.callor.student.service;

import com.callor.student.models.StudentDto;

public interface StudentService {
	/*
	 * 1. 입력받기
	 * 2. 데이터 찾기
	 * 3. 데이터 프린트 해주기
	 */
	public void input();
	public StudentDto selectStdName(String name);
	public void loadStd();
	public void printStd(String name);
}
