package basic.loop;

import java.util.Scanner;

public class WhileQuiz03 {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		System.out.print("정수1: ");
		int x = input.nextInt();
		System.out.print("정수2: ");
		int y = input.nextInt();
		
		if(x > y) {
			int temp = x;
			x = y; y = temp;
		}
		
		System.out.print(x + "부터 " + y + "까지의 누적합계: ");
		
		int total = 0;
		
		while(x <= y) {
			total += x;
			x++;
		}
		
		System.out.println(total);
		
		input.close();

	}

}
