package com.callor.opp.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.opp.utils.Line;

public class StringCA {
	//내가한거

	public static void main(String[] args) {

		String dataFile = "src/com/callor/opp/exec/data.txt";
		Scanner scan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] result = line.split(",");

//			int sum = 0;
			// 과목별 점수 출력
			for (int i = 1; i < result.length; i++) {
				System.out.printf("%3s\t", result[i]);
//				sum += Integer.valueOf(result[i]);
			}

			// 총점 출력
//			int j = 0;
			int[] sum = new int[1];
			for (int i = 1; i < result.length; i++) {
				sum[0] += Integer.valueOf(result[i]);
			}
			System.out.println(sum[0]);

//			System.out.println(sum);
//			sum = 0;
		} // end while
	} // end main
}
