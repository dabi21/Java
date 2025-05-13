package com.ss;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ScannerEx {

	public static void main(String[] args) {
		// Scanner를 이용하여 입력을 받아 봅시다
		
		// Scanner 생성
		Scanner scan = new Scanner(System.in);
		
		// 사용자로 부터 값을 입력 받아 옵니다
		///콘솔창에서 사용자의 입력을 대기
		// 사요자 값을 입력하고 엔터키를 누르면 사용자의 입력 갑을 반환한다

		// 콘솔창에 입력된 값을 읽어 오는 역활
		System.out.print("아룸 : ");	
		String str = scan.next();
		
		System.out.print("나이 : ");		
		int age = scan.nextInt();
		
		System.out.print("키 : ");
		double height = scan.nextDouble();
		
		System.out.println("================");
		System.out.println("이름 : " + str);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		//예외처리
		// 프로그램이 비상적으로 종료 되지 않도록 하는 처리
		
		
	}

}
