package com.callor.iolist.service;
/*
 * 1.파일 불러오기
 * 2.총 매입금,총 판매금 계산
 * 3.리스트 프린트하기
 */
public interface IoListService  {
	
	public void loadList();
	public int totalAmountP();
	public int totalSellingP();
	public void printList();
}
