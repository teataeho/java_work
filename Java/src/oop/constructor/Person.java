package oop.constructor;

import java.util.Scanner;

public class Person {
	
	String name;
	int age;
	int height;
	
	Scanner input = new Scanner(System.in);
	
	Person() {
		System.out.print("이름을 입력해주세요: ");
		name = input.next();
		System.out.print("나이를 입력해주세요: ");
		age = input.nextInt();
		System.out.print("신장을 입력해주세요: ");
		height = input.nextInt();
	}
	
	void info() {
		System.out.println("*** 신상정보 ***");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("신장: " + height + "cm");
	}

}
