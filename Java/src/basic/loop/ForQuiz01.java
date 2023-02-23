package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		int rn = (int) (Math.random() * 18 + 2);
		
		System.out.println("*** 구구단 " + rn + "단 ***");
		for(int i=1; i<=19; i++) {
			System.out.printf("%d x %d = %d\n", rn, i, i * rn);
		}
		
	}
	
}