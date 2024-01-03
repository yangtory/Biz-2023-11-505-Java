package com.callor.iolist.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.iolist.dto.IoIndex;
import com.callor.iolist.dto.IoListDto;
import com.callor.iolist.service.IoListService;
import com.callor.iolist.utils.Line;

public class IoListImplV1 implements IoListService {
	private String dataFile = "";
	private List<IoListDto> ioList = null;

	public IoListImplV1() {
		dataFile = "src/매입매출데이터.txt";
		ioList = new ArrayList<IoListDto>();
	}

	@Override
	public void loadList() {
		Scanner fileRead = null;
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileRead = new Scanner(is);
		while (fileRead.hasNext()) {
			String line = fileRead.nextLine();
			String[] lines = line.split(",");

			// 거래일자, 상품명, 거래처명, 대표자명, 구분, 매입단가, 판매단가, 수량
			IoListDto dto = new IoListDto();
			dto.date = lines[IoIndex.거래일자.getIndex()];
			dto.name = lines[IoIndex.상품명.getIndex()];
			dto.customer = lines[IoIndex.거래처명.getIndex()];
			dto.company = lines[IoIndex.대표자명.getIndex()];
			dto.divi = lines[IoIndex.구분.getIndex()];
			dto.buyP = lines[IoIndex.매입단가.getIndex()];
			dto.sailP = lines[IoIndex.판매단가.getIndex()];
			dto.qty = lines[IoIndex.수량.getIndex()];

			int intBuyP = Integer.valueOf(dto.buyP);
			int intSailP = Integer.valueOf(dto.sailP);
			int intQty = Integer.valueOf(dto.qty);
			if (dto.divi.equals("1")) dto.amountP = intBuyP * intQty;
			if (dto.divi.equals("2")) dto.sellingP = intSailP * intQty;

			ioList.add(dto);
		}
		fileRead.close();
	}

	@Override
	public int totalAmountP() {
		int totalAmountP = 0;
		for (int i = 0; i < ioList.size(); i++) {
			totalAmountP += ioList.get(i).amountP;
		}
		return totalAmountP;
	}

	@Override
	public int totalSellingP() {
		int totalSellingP = 0;
		for (int i = 0; i < ioList.size(); i++) {
			totalSellingP += ioList.get(i).sellingP;
		}
		return totalSellingP;
	}

	@Override
	public void printList() {
		Line.dLine(200);
		System.out.println("거래일자\t\t거래처\t\t\t상품이름\t매입금액\t판매금액");
		Line.sLine(200);

		for (IoListDto dto : ioList) {
			System.out.printf("%s\t", dto.date);
			System.out.printf("%s\t\t", dto.customer);
			System.out.printf("%s\t\t", dto.name);
			System.out.printf("%5d\t", dto.amountP);
			System.out.printf("%5d\n", dto.sellingP);
		}
		Line.sLine(200);
		System.out.printf("거래건수\t%d\t\t\t\t\t\t\t\t", ioList.size());
		System.out.printf("%d\t", this.totalAmountP());
		System.out.printf("%d\n", this.totalSellingP());
		Line.dLine(200);
	}

}
