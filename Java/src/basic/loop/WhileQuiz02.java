package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
		System.out.print("수를 입력해주세요: ");
		int num = input.nextInt();
		
		int i = 1;
		int total = 0;
		
		while(i <= num) {
			if(num % i == 0) {
				total += i;
			}
			i++;
		}
		
		System.out.println(num + "의 약수의 총합은 " + total + "입니다.");
		
		input.close();

	}

}
