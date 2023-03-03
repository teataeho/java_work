package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		/*
		 1. 스캐너를 통해 id를 입력받습니다.
		 2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높습니다.
		 3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요.
		 4. 5글자 이상 입력되었다면 "id가 등록되었습니다." 출력후 종료하세요.
		 */

		Scanner input = new Scanner(System.in);
		String id;

		while(true) {
			System.out.print("id를 입력해주세요.\n> ");
			id = input.nextLine().trim();
			id = id.replace(" ", "");

			if(id.length() < 5) {
				System.out.println("id는 5글자 이상이어야합니다.");
			} else {
				System.out.println("id가 등록되었습니다.");			
				break;
			}
		}
		System.out.println(id);
		input.close();

	}

}
