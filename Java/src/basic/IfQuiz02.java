package basic;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
		 혹은 같은지를 판별하시면 됩니다.
		 ex)
		 입력받은 수: 4, 7 -> 7이 큰 수 입니다.
		 입력받은 수: 10, 3 -> 10이 큰 수 입니다.
		 입력받은 수: 5, 5 -> 같은 수 입니다.
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요: ");
		int a = input.nextInt();
		System.out.print("두 번째 수를 입력하세요: ");
		int b = input.nextInt();
		
		if(a > b) {
			System.out.println(a + "이(가) 큰 수 입니다.");
		} else if(a < b) {
			System.out.println(b + "이(가) 큰 수 입니다.");
		} else {
			System.out.println("같은 수 입니다.");
		}
		
		input.close();
		
	}

}
