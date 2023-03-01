package chap1;

import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean[] students = new boolean[10];
		
		int cnt = 0;
		System.out.println("과제를 제출한학생의 번호를 입력하세요.[1 ~ 10]");
		while(true) {
			System.out.print("> ");
			int assignment = input.nextInt();
			
			if(assignment < 1 || assignment > 10) {
				System.out.println("없는 번호입니다.");
				return;
			}
			
			if(students[assignment-1] == false) {
				students[assignment-1] = true;
				cnt++;
			} else {
				System.out.println("이미 제출한 학생입니다.");
			}
			
			if(cnt == 8) {
				System.out.println("입력을 완료했습니다.");
				break;
			}
		}
		
		System.out.println("숙제를 안 낸 학생의 번호:");
		for(int i=0; i<students.length; i++) {
			if(students[i] == false) {
				System.out.println(i+1);
			}
		}
		
		input.close();

	}

}
