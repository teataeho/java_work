package basic.loop;

public class LoopNestingQuiz01 {

	public static void main(String[] args) {

		for(int dan=2; dan<=9; dan++) {
			System.out.print(dan + "단: ");
			for(int hang=1; hang<=9; hang++) {
				System.out.printf("%dx%d=%d ", dan, hang, dan*hang);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------");
		
		for(int hang=0; hang<=9; hang++) {
			for(int dan=2; dan<=9; dan++) {
				if(hang == 0) {
					System.out.print(dan + "단\t");
				} else {
					System.out.printf("%dx%d=%d\t"
							, dan, hang, dan*hang);
				}
			}
			System.out.println();
		}

	}

}
