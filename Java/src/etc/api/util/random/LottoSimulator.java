package etc.api.util.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();

	static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
	static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
	static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
	static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
	static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
	static int failCnt = 0; //꽝 당첨 횟수를 세 줄 변수

	public static List<Integer> createLotto() {

		/*
		 - 1~45 범위의 난수 6개를 생성하셔서
		  컬렉션 자료형에 모아서 리턴해 주세요.
		  무엇을 쓰든 상관하지 않겠습니다.
		  중복이 발생하면 안됩니다.
		 */

		Set<Integer> rnNums = new HashSet<>();

		while(rnNums.size() < 6) {
			int num = r.nextInt(45) + 1;
			rnNums.add(num);
		}
		List<Integer> lotto = new ArrayList<>(rnNums);
		return lotto;
	}

	//보너스 번호를 생성하는 메서드
	public static int createBonusNum(List<Integer> lotto) {

		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
		  당첨 번호들을 피해서 보너스번호 하나만 뽑아 주세요.
		  범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
		 */

		Random r = new Random();
		int bonusNum = 0;
		while(true) {
			bonusNum = r.nextInt(45) + 1;
			if(!lotto.contains(bonusNum))
				return bonusNum;
		}

	}

	//당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(List<Integer> lotto, List<Integer> buyNums, int bonusNum) {
		/*
		 매개값으로 당첨번호, 구매한 로또 번호집합, 보너스번호를 받습니다.
		 내 로또 번호와 당첨번호를 비교하여
		 일치하는 횟수를 세 주신 후 등수를 판단하세요.
		 판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
		 6개 일치 -> 1등
		 5개 일치 + 보너스번호 일치 -> 2등
		 5개 일치 -> 3등
		 4개 일치 -> 4등
		 3개 일치 -> 5등
		 나머지 -> 꽝
		 */

		int cnt = 0;
		for(int i : buyNums) {
			if(lotto.contains(i)) cnt++;
		}

		if(cnt == 6) prize1++;
		else if(cnt == 5) {
			if(buyNums.contains(bonusNum)) prize2++;
			else prize3++;
		} else if(cnt == 4) prize4++;
		else if(cnt == 3) prize5++;
		else failCnt++;		

	}

	public static void main(String[] args) {

		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
		List<Integer> lotto = createLotto();
		//보너스번호도 하나 고정시키세요.
		int bonusNum = createBonusNum(lotto);
		System.out.println(bonusNum);
		int count = 0;

		while(true) {
			/*
			 - 1등이 당첨 될 때까지 반복문을 돌립니다.
			 - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨횟수를 출력하고
			  반복문을 종료합니다.
			 - 로또를 구매하기 위한 금액도 출력하세요. (long)
			 */

			count++;
			System.out.println(count + "번째 로또 구매!");
			Set<Integer> buy = new HashSet<>();

			while(buy.size() < 6) {
				int num = r.nextInt(45) + 1;
				buy.add(num);
			}
			List<Integer> buyNums = new ArrayList<>(buy);

			checkLottoNumber(lotto, buyNums, bonusNum);


			if(prize1 == 1) {
				System.out.println("*** 1등 당첨! ***");
				System.out.println("2등: " + prize2 + "번");
				System.out.println("3등: " + prize3 + "번");
				System.out.println("4등: " + prize4 + "번");
				System.out.println("5등: " + prize5 + "번");
				System.out.println("꽝: " + failCnt + "번");
				System.out.println("사용한 금액: " + count*1000L + "원");
				break;
			}
		}


	}

}
