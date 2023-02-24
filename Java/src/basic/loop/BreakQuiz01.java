package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("종료하고 싶으시면 0을 입력해주세요.");

		int correctCnt = 0;
		int incorrectCnt = 0;

		while(true) {
			int num1 = (int) (Math.random() * 100 + 1);
			int num2 = (int) (Math.random() * 100 + 1);
			int randomOpr = (int) (Math.random() * 2);
			String opr = (randomOpr == 0 ? "+" : "-");
			int result = (randomOpr == 0 ? num1+num2 : num1-num2);

			if(result != 0) {
				System.out.printf("%d %s %d = ???\n> ", num1, opr, num2);
				int inputResult = input.nextInt();

				if(inputResult == result) {
					System.out.println("정답입니다!");
					correctCnt++;
				} else if(inputResult == 0) {
					System.out.println("종료합니다.");
					break;
				} else {
					System.out.println("오답입니다.");
					incorrectCnt++;
				}
			}
		}

		System.out.println("----------------");
		System.out.println("정답 횟수: " + correctCnt + "회");
		System.out.println("오답 횟수: " + incorrectCnt + "회");

		input.close();

	}

}
