package com.ss.scan;

import java.util.Scanner;

public class ScanEx {
	/*
	 * 사용자로부터 이름, 키, 몸무계를 입력 받아서 화면에 출혁 합니다.
	 */
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.println("이름은  " + name);

		System.out.print("나이 : ");
		String age = scan.next();
		System.out.println("나이는  " + age);
		
		System.out.print("키 : ");
		String h = scan.next();
		System.out.println("키는  " + h);

	
	
	}
}
