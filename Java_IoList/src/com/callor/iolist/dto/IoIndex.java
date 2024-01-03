package com.callor.iolist.dto;

public enum IoIndex {
	거래일자(0),
	상품명(1),
	거래처명(2),
	대표자명(3),
	구분(4),
	매입단가(5),
	판매단가(6),
	수량(7);
	
	private int index;
	private IoIndex(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}

}
