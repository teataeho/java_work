package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("현재 온도를 입력하세요(℃): ");
		double temp = input.nextDouble();
		
		System.out.printf("현재 화씨 온도는 %.1f℉입니다."
				, (temp * 1.8 + 32));

		input.close();
	}

}
