package chap1;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		for(int i=0; i<scores.length; i++) {
			System.out.print("점수" + (i+1) + ": ");
			scores[i] = input.nextInt();
		}

		int[] rank = new int[5];
		
		for(int j=0; j<scores.length; j++) {
			int cnt = 1;
			for(int k=0; k<scores.length; k++) {
				if(scores[j] < scores[k]) cnt++;
			}
			rank[j] = cnt;
		}
		
		System.out.println("점수\t\t순위");
		System.out.println("-------------------");
		for(int l=0; l<scores.length; l++) {
			System.out.printf("%d\t\t%d\n", scores[l], rank[l]);
		}
		
		input.close();
		
	}

}
