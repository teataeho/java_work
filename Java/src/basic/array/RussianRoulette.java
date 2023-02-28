package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {

		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */

		Scanner input = new Scanner(System.in);

		//게임 인원 입력
		int numPeople;
		while(true) {
			System.out.println("인원을 입력해주세요(2~4인)");
			System.out.print("> ");
			numPeople = input.nextInt();
			if (numPeople >= 2 && numPeople <= 4) break;
			else {
				System.out.println("인원은 2명에서 4명까지만 배치 가능합니다.");
			}
		}

		//플레이어 이름 등록
		//배열을 하나 생성해서 플레이어 배치
		//배열의 크기는 게임 참가자의 명수와 동일
		String[] people = new String[numPeople];
		while(true) {
			int rn = (int) (Math.random()*numPeople);
			if(people[rn] != null) continue;
			System.out.println("플레이어 이름을 입력해주세요");
			System.out.print("> ");
			people[rn] = input.next();

			boolean flag = false;
			for(String p : people) {
				if(p == null) {
					flag = true; break;
				}
			}
			if(!flag) break;
		}

		//실탄 개수 입력(1<=a<6)
		int numBullet;
		while(true) {
			System.out.println("실탄 개수를 입력해주세요.(1~5발)");
			System.out.print("> ");
			numBullet = input.nextInt();
			if (numBullet >= 1 && numBullet <= 5) break;
			else {
				System.out.println("실탄은 1발에서 5발까지만 배치 가능합니다.");
			}
		}

		//실탄을 탄창에 배치합니다.
		boolean[] bulletPos = new boolean[6];
		//난수를 생성하셔서 실탄을 탄창에 배치합니다.
		//false -> true로 바꾸는 것이 실탄 장전입니다.
		//난수는 중복으로 발상핼 가능성이 있기 때문에 중복 방지 로직을 세워서
		//같은 위치에 두개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		for(int i=0; i<numBullet; i++) {
			int rn = (int) (Math.random()*bulletPos.length);
			if(bulletPos[rn] != false) {
				i--; continue;
			}
			bulletPos[rn] = true;		
		}
		System.out.println(Arrays.toString(bulletPos));

		//실행 순서 정하기
		//난수를 이용해서 실행 순서를 정합니다.
		//시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		//아예 배치를 섞으셔도 상관없습니다.
		input.nextLine();		
		System.out.println("다음의 순서로 게임을 시작합니다.");
		System.out.println(Arrays.toString(people));

		//일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		//이 입력값(enter)은 받아서 활용할 것이 아니기 때문에
		//따로 변수를 선언하지 않습니다.
		input.nextLine();

		//최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때 까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한 명 아웃되면 배열의 크기를 줄여 주세요.
		int ord = 0;
		int realBulletPos = 0;
		while(true) {
			System.out.println(people[ord] + "님이 방아쇠를 당깁니다.");
			if(!bulletPos[realBulletPos]) {
				System.out.println("틱~\n격발되지 않았습니다.");
				ord++;
				realBulletPos++;
			} else {
				System.out.println("빵!");
				System.out.println(people[ord] + "님이 사망하셨습니다.");
				numBullet--; numPeople--;
				System.out.println("남은 총알의 갯수 : " + numBullet + "개");

				for(int i=ord; i<people.length-1; i++) {
					people[i] = people[i+1];
				}
				String[] temp = new String[people.length-1];
				for(int j=0; j<temp.length; j++) {
					temp[j] = people[j];
				}
				people = temp; temp = null;
				System.out.print("남은 인원: " + Arrays.toString(people));
				System.out.println();
				
				for(int i=0; i<6; i++) {
					bulletPos[i] = false;
				} // 총알빼기 end
				for(int i=0; i<numBullet; i++) {
					int rn = (int) (Math.random()*6);
					if(bulletPos[rn] != false) {
						i--;
						continue;
					}
					bulletPos[rn] = true;		
				} // 총알섞기 end
				System.out.println(Arrays.toString(bulletPos));
				realBulletPos = 0;
			} // 발사될때 end
			if(numPeople == 1 || numBullet == 0) {
				System.out.print(Arrays.toString(people));
				System.out.println("님이 살아남으셨습니다.");
				break;
			}
			
			if(ord == numPeople) {
				ord = 0;
			}
			
			input.nextLine();
			
		} // while(true) end

		input.close();
	}

}
