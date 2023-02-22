package basic.iff;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("국어점수를 입력해주세요: ");
		int kor = input.nextInt();
		System.out.print("영어점수를 입력해주세요: ");
		int eng = input.nextInt();
		System.out.print("수학점수를 입력해주세요: ");
		int math = input.nextInt();

		double avg = (kor + eng + math) / 3.0;
		
		System.out.println("------------------------");

		if(kor > 100 || eng > 100 || math > 100) {
			System.out.println("잘못된 점수입니다.");
		} else if(kor < 0 || eng < 0 || math < 0) {
			System.out.println("잘못된 점수입니다.");
		} else {
			if(avg >= 90) {
				if (avg >= 95){
					System.out.println("당신의 학점은 A+ 입니다.");
				} else {
					System.out.println("당신의 학점은 A0 입니다.");
				}
			} else if(avg >= 80) {
				System.out.println("당신의 학점은 B 입니다.");
			} else if(avg >= 70) {
				System.out.println("당신의 학점은 C 입니다.");
			} else if(avg >= 60) {
				System.out.println("당신의 학점은 D 입니다.");
			} else {				
				System.out.println("당신의 학점은 F 입니다.");
			}
			System.out.printf("평균 점수: %.1f\n", avg);
		}

		input.close();

	}

}
