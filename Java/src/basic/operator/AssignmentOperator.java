package basic.operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		/*
		 # 대입 연산자 (=)
		 # 복합 대입 연산자 (+=, -=, *=, /=, %=)
		 - 변수에 값을 대입할 때 사용하는 연산자 입니다.
		 - 복합 대입 연산자는 대입 연산자에 산술 연산자가 결합되어 있는 형태입니다.
		 */

		int a = 5;
		int b = 5;
		
		b =+ 3; // 그냥 b = +3;으로 해석된다.
		System.out.println(b);
		
		a += 3; //a = a + 3
		System.out.println(a);
		
		System.out.println("---------------------------------");
		
		a -= 4; //a = a - 4
		System.out.println(a);
		
		a *= 6; //a = a * 6
		System.out.println(a);
		
		a /= 5; //a = a / 5
		System.out.println(a);
		
		a %= 3; //a = a % 3
		System.out.println(a);
	}

}
