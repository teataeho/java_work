package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		/*
		int i = 1;
		int total = 0;
		while(i <= 10) {
			total += i;
			i++;
		}
		 */
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			total += i;
		}
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력해 보세요. (for)
		
		for(int i=1; i<=200; i++) {
			if(i % 6 == 0 && i % 12 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요.
		
		int cnt = 0;
		
		for(int i=1; i<=60000; i++) {
			if(i % 177 == 0) {
				cnt++;
			}
		}
		
		System.out.println("177의 배수의 개수는 " + cnt + "개 입니다.");
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		//팩토리얼) 5! -> 5 x 4 x 3 x 2 x 1
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int x = input.nextInt();
		int factorial = 1;
		
//		for(int i=1; i<=x; i++) {
//			factorial *= i;
//		}
		
		for(int i=x; i>=1; i--) {
			factorial *= i;
		}
		
		System.out.println(x + "의 팩토리얼: " + factorial);
		
		input.close();
	}

}
