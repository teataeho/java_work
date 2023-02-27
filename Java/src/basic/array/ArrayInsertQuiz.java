package basic.array;

import java.util.Scanner;

public class ArrayInsertQuiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] foods = new String[50];

		for(int i=0; i<foods.length; i++) {
			boolean flag = false;
			System.out.print("음식을 입력해주세요: ");
			String food = input.next();
			
			if(food.equals("배불러")) break;
			for(String f : foods) {
				if(food.equals(f)) {
					System.out.println("이미 존재하는 음식입니다.");
					flag = true;
					i--;
					break;
				}
			}
			if(!flag) foods[i] = food;
		}

		System.out.println("-------------------------");
		for(String food : foods) {
			if(food == null) break;
			System.out.print(food + " ");
		}

		input.close();

	}

}
