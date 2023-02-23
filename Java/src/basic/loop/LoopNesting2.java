package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {

		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = input.nextInt();

		System.out.println("입력받은 수 -> " + num);

		int cnt = 0; //소수의 개수를 세 줄 변수.
		System.out.print("소수: ");
		for(int i=2; i<=num; i++) {
			int cnt2 = 0; //소수의 판별을 위해서 약수의 개수를 세 줄 변수.
			for(int j=2; j<=i; j++) {
				if(i % j == 0) {
					cnt2++;
				}
			}
			if(cnt2 == 1) {
				System.out.print(i + " ");
				cnt++;
			}
		}

		System.out.println("\n소수의 개수: " + cnt + "개");

	}

}
