package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		//48 ~ 150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		//(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)
		
		int i = 48;
		
		while(i <= 150) {
			if(i % 8 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		
		//1 ~ 100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int n = 1;
		
		while(n <= 100) {
			if(n % 4 == 0 && n % 8 != 0) {
				System.out.print(n + " ");
			}
			n++;
		}
		
		System.out.println();

		//1~30000까지의 정수 중 258의 배수의 개수를 출력.

		int x = 1;
		int count1 = 0;
		
		while(x <= 30000) {
			if(x % 258 == 0) {
				count1++;
			}
			x++;
		}
		
		System.out.println("258의 배수의 개수는: " + count1 +"개 입니다.");
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int a = 1;
		int count2 = 0;
		
		while(a <= 1000) {
			if(1000 % a == 0) {
				count2++;
			}
			a++;
		}
		
		System.out.println("1000의 약수의 개수는: " + count2 +"개 입니다.");

	}

}
