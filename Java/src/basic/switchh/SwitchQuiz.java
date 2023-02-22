package basic.switchh;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {

		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		  다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		  연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		  연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
		  결과를 말씀해 주세요.
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("정수1: ");
		int num1 = input.nextInt();
		System.out.print("연산을 선택하세요 [+, -, *, /]: ");
		String opr = input.next();
		System.out.print("정수2: ");
		int num2 = input.nextInt();
		
		int result = 0;
		boolean flag = false;
		
		switch(opr) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("연산할 수 없는 입력값입니다.");
				flag = true;
				break;
			}
			result = num1 / num2;
			break;
		default:
			System.out.println("옳바른 연산자를 입력해주세요.[+, -, *, /]");
			flag = true;
		}
		
		if(!flag) { // boolean값은 flag == false라 쓰지 않는다.
			System.out.printf("%d %s %d = %d", num1, opr, num2, result);
		}

		/*
		switch(opr) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("연산할 수 없는 입력값입니다.");
				break;
			}
			System.out.println(num1 / num2)
			break;
		default:
			System.out.println("옳바른 연산자를 입력해주세요.[+, -, *, /]");
		}
		*/

		input.close();

	}

}
