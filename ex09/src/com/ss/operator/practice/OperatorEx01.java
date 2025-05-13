package com.ss.operator.practice;

public class OperatorEx01 {
	public void method01() {
		boolean isTrue = false;
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("!isTrue : " + !isTrue);
		System.out.println("isTrue : " + isTrue);
	
		isTrue = !isTrue;
		
		if(!true) {
		
		}
		System.out.println("최종 결과 : " + !false);
	}
	/*
	 * 증감 연산자
	 * (증감연산자)값 : 연산을 먼저
	 * 값(증감연산자) : 다음행으로 넘어가면 값이 증가
	 * 
	 */
	public void method02() {
		int num = 10;
		System.out.println("num : " + num);
		//전위연산자
		System.out.println("++num : " + ++num);
		System.out.println(++num);
		
		System.out.println("num++ : " + num++);
		System.out.println("num : " + num);
	}
	
	public void method03() {
		int num = 10;
		int num1 = 3;
		
		int res;
		res = num % num1;
		System.out.println("res : + res");
		
		// 정수끼리의 연산시 실수로 받고 싶은 경우
		// 1. 정수와 정수의 연산 결과는 정수 타입을 반환하므로
		// 어느 한쪽을 실수로 형 변환 후 연산을 진행
		double res_d = (double)num / num1;
		System.out.println("res_d : " + res_d);
		
		// 1. 자동형변환을 유도
		res_d = num * 1.0;
		
		// 예외가 발생하는 경우
		System.out.println(5/0.0); // Infinity(무한대)
		// 연산 결과과 무한대인지 확인 하는 방법
		System.out.println("무한대인지 확인 :" + Double.isInfinite(5/0.0));
		//System.out.println(5/0); // 예외(ArithmeticException) - 프로그램 종류
		
		
		
	}
	
}
