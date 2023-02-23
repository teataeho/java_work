package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("구구단을 입력하세요: ");
		int num = input.nextInt();

		System.out.println("*** 구구단 " + num + " 단 ***");

		int i = 1;
		while(i <= 9) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
			i++;
		}

		input.close();

	}

}
