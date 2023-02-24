package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("*** UP&DOWN 게임 ***");
		System.out.println("# 1부터 100까지의 정수 중 어느 숫자가 선택되었을까요?");

		int rn = (int) (Math.random()*100 + 1);
		int cnt = 0;

		while(true) {
			System.out.print("> ");
			int answer = input.nextInt();

			if(answer < rn) {
				cnt++;
				System.out.println("UP!!!");
				if(cnt < 7) {
				System.out.println("정답 기회 " + (7 - cnt) + "번 남음!");
				}
			} else if(answer > rn) {
				cnt++;
				System.out.println("DOWN!!!");
				if(cnt < 7) {
				System.out.println("정답 기회 " + (7 - cnt) + "번 남음!");	
				}
			} else {
				System.out.println("정답입니다!");
				System.out.println((cnt + 1) + "번 만에 맞추셨네요~");
				if(cnt >= 7) {
					System.out.println("패배했습니다 ㅠㅠ");
				}
				break;
			}
			if(cnt == 7) {
				System.out.println("정답 기회 모두 소진!");
				System.out.println("마저 정답을 맞춰주세요.");
			}
		}

		input.close();
	}

}
