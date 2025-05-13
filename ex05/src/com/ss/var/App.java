package com.ss.var;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.ss.var.practice.Calc;

public class App {
	// 전역변수
	int num =1;
	
	public static void main(String[] args) {
		// 지역변수
		
		// 타입 변수명 = 값(리터럴)
		int num =1;
		// 동일한 변수명은 사용 할 수 없다.
		double num1 = 3.14;
		boolean isTrue = false;
		String str = "반갑습니다..";
		
		System.out.println(num+1);
		System.out.println(isTrue);
		System.out.println(str+1+1);
			
		//int num1;
		
		add(1,2);
		add(num, num);
		
		int 변수명 =0;
			
		int num1234 = 1234;
		System.out.println(num1234);
		
		// 문자열 "삼성캠퍼스" 를 입력하고 변수 ss에 담아봅시다.
		String ss = "삼성캠퍼스2";
		System.out.println("문자열 출력 : " + ss);
		
		// num1234와 ss를 연력해서 출력
		//
		System.out.println(num1234 + ss);
		
		
		//상수
		//상수 이름은 대문자로 작성하는 것이 관례이다
		final String STR_STR = "";
		final int INT_INT;
		STR_STR = "심상캠퍼스";
		//상수는 값을 한번만 초기화 할 수 있다
		// STR_STR = "삼성캠퍼스";
		
		
		
		
	}
	
	// 메서드의 선언부 : 메서드를 정의
	// 접근제한자    반환타입   메서드명()
	// static : 생성하지 않고 사용할 수 있다(new 안쓰고 슬 수 있다), 즉 static을 쓰면 메모리에 미리 올라가는 감.
	private static void add(int a, int b) {
		// 매개변수에서 사용된 이름은 사용 못함
		//int a =1;
		int aa = 1;
		
	}
		Calc c = new Calc();
		int res = c.minus(10, 5, 3);
		
		
//		Calc c = new Calc();
	
//		
//		int aa = c.plus(1, 2);
//		System.out.println("더하기 :" +  aa);
//		
//		int bb = c.minus(2, 3);
//		System.out.println("빼기 : " + bb);

		
		
	

}
