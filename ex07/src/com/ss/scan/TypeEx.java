package com.ss.scan;

import java.util.Scanner;

public class TypeEx {
	public static void main(String[] args) {
		TypeEx te = new TypeEx();
//		te.declear();
//		
//		te.inputByScanner();
		
//		te.inputByScanner2();

		te.autoCasting();
	}
	
	private  void declear() {
		/**
		 *  변수의 선언 + 할당(초기화) => 자료형(타입) 변수명 = 값(리터럴);
		 *  값을 할당(초기화)할 때 메모리에 올라감, 미할당시 컴파일 에러 발생 
		 */
		
		// 메서드 안에서 같은 이름에 변수명 사용 X, 타입이 달라도 같은 이름에 변수명 사용 X
		int num = 1;
		int num1 = 2;
		System.out.println("num 은 : " + num);
		System.out.println("num1 은 : " + num1);		
		
		boolean isTrue = false;
		isTrue = true;
		System.out.println(isTrue);
		
		double d = 3.14;
		System.out.println(d);
		
		String name = "\"삼성캠퍼스\"";
		System.out.println(name);
		
		String str = "10";
		// 문자를 숫자로 형변환 = 숫
		int num2 = Integer.parseInt(str);
		
		/*
		 * 변수의 명명 규칙
		 * 1. 대소문자를 구분
		 * 2. 예약어를 사용할 수 없다
		 * 3. 숫자로 시작할 수 없다.
		 * 4. 특수문자는 '_', '$'  만 사용이 가능합니다.
		 * 
		 */
		int Age;
		int age;
		int _age;
		int $_age;
		//int 1age;
		int i;
	
	}
	// 매개변수 없고 반환이 없는 메서드
	private void inputByScanner() {
		//콘솔창에서 사용자의 입력을 받아 올 수 있다.
		Scanner scanner = new Scanner(System.in);
		/*
		 * scanner.nextLine() : 사용자가 입력한 값을 모두 읽어온다. (문자열)
		 * scanner.next() : 사용자가 입력한 값 중에 공백이 있을 경우 공백 이전까지의 값만 읽어온다.
		 * scanner.nextInt() : 정수를 입력받을 때 사용한다.
		 * scanner.nextDouble() : 실수를 입력받을 때 사용한다.
		 * ... 그 밖에 byte, boolean 등의 기본 자료형을 입력받을 때도 마찬가지로 nextXXX()로 입력받으면 된다. 
		 */ 


		String str = scanner.next();
		String str1 = scanner.next();
		String str2 = scanner.next();
		String str3 = scanner.next();
 		
		System.out.println("str : " + str);
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		//scanner.nextXXX() 메소드 뒤에 scanner.nextLine() 메소드를 사용하게 된다면 버퍼에 남아있는 
		//'엔터'를 빼주기 위해서 scanner.nextLine() 메소드를 한 번더 써야한다. 
		// 엔터가 버퍼에 남아 있어서 nextLine() 메서드를 이용해서 엔터를 제거 후 다음 입력을 받을 수 있다.
		//a b c d
		String str4 = scanner.nextLine();
		System.out.println("str4 : " + str4);
		
		String str5 = scanner.nextLine();
		System.out.println("str5 : " + str5);
	}
	
	private void inputByScanner2() {
		// 사용자로 부터 이름, 나이, 키를 입력 받아서 출력 해봅시다
		// 키는 소수점 첫째자리까지 입력 합니다.
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		double height;

		name = scanner.next();
		age = scanner.nextInt();
		height = scanner.nextDouble();
		
		System.out.print("이름 : " + name);
		System.out.print("  나이 : " + age);
		System.out.println("  키 : " + height);
		System.out.println("당신에 이름은 " + name + "이고, 나이는 " + age + "살, 키는 " + height + "cm 입니다.");
		
		// 형식문자열 출력   %s : 문자,  %d : 정수, %f : 실수
		System.out.printf("당신에 이름은 %s, 나이는 %d살, 키는 %.2fcm .", name, age, height);
	}
	
	/* 형봔환 
	 *  - 자동형 변환(묵시적 형번환) : 개발자가 신경쓸 필요가 없다, 데이터 표현 범위가 작은 자료형이 큰 자료형으로 변환 될대 발생 ex) int > double
	 *  - 강제형 변환(명시적 형변환) : (타입) 값;    강제 형반환의 경우 데이터의 손실이 발생 할 수 있다.
	 */
	private void autoCasting() {
		int height = 163;
		float h = height; 
		System.out.println("h : " + h);
		double h1 = height;  // 163.0
		System.out.println("h1 : " + h1);
		
		// int/int = int,   int/double = double
		// 연산시 타입이 일치해야 연산이 가능 -> double/double = double
		double height_m = 163/100.0;
		System.out.println("height_m : " + height_m);

	}
	
}

