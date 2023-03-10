package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String resiId;
		char c;

		outer: while(true) {
			System.out.print("주민등록번호를 입력하세요: ");
			resiId = input.next();
			c = resiId.charAt(7);
			
			if(resiId.indexOf("-") == -1) {
				System.out.println("주민등록번호는 하이픈을 포함시켜 주세요.");
				continue;
			}
			try {
				String[] str = resiId.split("-", 2);
				Integer.parseInt(str[0]);
				Integer.parseInt(str[1]);
			} catch(Exception e) {
				System.out.println("정수로 정확히 입력해 주세요.");
				continue;
			}
			switch(c) {
			case '1': case '2': case '3': case '4':
				break outer;
			default:
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나여야 합니다.");
				continue outer;
			}
			
		}
		
		int year;
		int month = Integer.parseInt(resiId.substring(2, 4));
		int day = Integer.parseInt(resiId.substring(4, 6));
		int age;
		String gender;
		
		if(c == '1' || c == '2') {
			year = Integer.parseInt(resiId.substring(0, 2)) + 1900;
		} else {
			year = Integer.parseInt(resiId.substring(0, 2)) + 2000;
		}
		
		age = 2023 - year;
		
		if(c == '1' || c == '3') {
			gender = "남자";
		} else {
			gender = "여자";
		}
		
		System.out.printf("%d년 %d월 %d일 %d세 %s", year, month, day, age, gender);

		input.close();
		
	}

}
