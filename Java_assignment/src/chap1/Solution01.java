package chap1;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		for(int i=0; i<nums.length; i++) {
			System.out.print("숫자" + (i+1) + ": ");
			nums[i] = input.nextInt();
		}
		
		int max = nums[0];
		for(int j=0; j<nums.length-1; j++) {
			if(max < nums[j+1]) max = nums[j+1];
		}
		System.out.println("----------------");
		System.out.println("가장 큰 값: " + max);
		
		input.close();
	}

}
