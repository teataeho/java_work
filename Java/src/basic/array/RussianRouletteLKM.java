package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRouletteLKM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임 인원(2 ~ 4) --> ");
		int playerNum = sc.nextInt();
		
		if(playerNum < 2 || playerNum > 4) {
			System.out.println("게임 인원이 올바르지 않습니다. 게임을 종료합니다.");
			sc.close();
			return; //main 함수 종료.
		}
		
		System.out.println("\n플레이어의 이름을 등록할게요.");
		String[] players = new String[playerNum];
		for(int i=0; i<players.length; i++) {
			System.out.printf("%d번 플레이어 이름: ", i+1);
			players[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(players) + "참가!");
		
		System.out.print("\n실탄 개수(6 미만): ");
		int bullet = sc.nextInt();
		
		if(bullet < 1 || bullet > 5) {
			System.out.println("실탄 수가 올바르지 않습니다. 게임을 종료합니다.");
			sc.close();
			return;
		}
		
		boolean[] bulletPos = new boolean[6];
		
		int checkNum = 0; //실탄을 정확하게 장전한 횟수.
		while(checkNum < bullet) {
			int position = (int) (Math.random()*bulletPos.length);
			if(bulletPos[position] == true) {
				continue;
			} else {
				bulletPos[position] = true;
				checkNum++;
			}
		} // 총알 배치 끝.
		
		int startIdx = (int) (Math.random()*playerNum);
		System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[startIdx]);
		
		sc.nextLine();
		
		int realBulletPos = 0;
		
		while(true) {
			
			
			System.out.printf("\n\n[%s의 턴!]\t탄창을 장전했습니다.\n", players[startIdx]);
			System.out.println("# 엔터를 누르면 격발합니다!");
			sc.nextLine();
			
			if(bulletPos[realBulletPos]) { // 총알 격발!
				
				System.out.printf("\n빵!!!\n[%s] 사망...\n", players[startIdx]);
				bullet--;
				playerNum--;
				bulletPos[realBulletPos] = false; //총알이 소모되었으니 false로 변경.
				
				//지금 죽은 사람 기준으로 뒤에 있는 값을 한칸씩 땡기는 작업.
				for(int i=startIdx; i<players.length-1; i++) {
					players[i] = players[i+1];
				}
				
				String[] temp = new String[players.length-1];
				
				for(int j=0; j<temp.length; j++) {
					temp[j] = players[j];
				}
				players = temp; temp = null;
				
				System.out.println("생존 인원: " + Arrays.toString(players));
				
				if(players.length == 1) {
					System.out.println("최종 생존자: " + players[0]);
					System.out.println("게임을 종료합니다.");
					break;
				} else if(bullet == 0) {
					System.out.println("총알이 다 떨어졌습니다.");
					System.out.println("최종 생존자: " + Arrays.toString(players));
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					System.out.println("남은 인원이 게임을 재개합니다.");
					
					sc.nextLine();
				}
			} else { // false였기 때문에 생존.
				System.out.println("휴... 살았습니다.");
				startIdx++;
			}
			
			//플레이어가 생존할 때마다 startIdx의 값을 하나씩 올리고 있는데,
			//맨 마지막 사람까지 생존했을 경우에는 다음 차례가 첫번째 사람이기 때문에
			//인덱스를 0으로 바꿔서 배열 맨 앞사람이 순서를 가질 수 있도록 처리.
			if(startIdx == playerNum) {
				startIdx = 0;
			}
			
			realBulletPos++;
			
		}

		sc.close();
		
	}

}
