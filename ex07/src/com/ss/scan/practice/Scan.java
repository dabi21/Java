package com.ss.scan.practice;

import java.util.Scanner;

public class Scan {
	/**
	 * 사용자의 입력을 m 단위로 입력 받아 옵니다.
	 * nextDouble()
	 */
	public void bmi_m1() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 키(m) 는 : ");
		int h = scanner.nextInt();
		//ouble h_m = scanner.nextDouble();
		double h_m = h/100.0;
		System.out.print("당신의 키(m)는 : " + h_m + "입니다.");
		
		System.out.println("당신의 몸무게는 ");
		int w = scanner.nextInt();
		System.out.println("당신의 몸무게는 : " + w + "입니다.");
		
		System.out.println("당신의 dmi는  ");
		double bmi = w/(h_m*h_m);
		System.out.println("당신의 BMI : " + bmi + "입니다.");

	}
	/**
	 * 사용자의 입력을 cm 단위로 입력 받아 옵니다.
	 * nextInt()
	 */
	public void bmi_m() {
		// 웹어플리케이션 서버(was) : 동적 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사용자 키(m) : ");
		double h = scanner.nextDouble();
		System.out.println("당신의 키(m)는 : " + h + "입니다.");

		System.out.println("당신의 몸무게 :  ");
		double w = scanner.nextDouble();
		System.out.print("당신의 몸무게는 : " + w + "입니다.");
		
		//bmi를 구한후(연산) 변수에 값을 저장, 변수명은 bmi로 한다
		double bmi = w/(h*h);
		System.out.printf("당신의 키는 %.2f, 몸무게는 %.2f이고, \n", h, w);
		System.out.printf("당신의 bmi는 %.2f 입니다.", bmi);
		
		String  type = "";
		if(bmi<18.5) {
			type = "저체중";
			//System.out.println("당신은 저체중 입니다.");
		} else if(bmi<23) {
			type = "정상";
			//System.out.println("당신은 정상입니다.");
		} else if(bmi<25) {
			type = "과체중";
			//System.out.println("당신은 과체중입니다.");
		} else {
			type = "비만";
			//System.out.println("당신은 비만 입니다.");
		} System.out.printf("당신은 %s입니다.", type);
		
	}


		
}
