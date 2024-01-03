package com.callor.iolist.exec;

import com.callor.iolist.service.IoListService;
import com.callor.iolist.service.impl.IoListImplV1;

public class ExecA {
	public static void main(String[] args) {
		IoListService ioService = new IoListImplV1();
		ioService.loadList();
		ioService.printList();
		
	}
	

}
