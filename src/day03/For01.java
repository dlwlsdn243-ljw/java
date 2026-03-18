package day03;

public class For01 {

	public static void main(String[] args) {
		// for문
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * - 종류 : for문, while문, do~while문
		 * 			- for문과 while문은 문법은 다르지만 동작 방식은 같다.
		 * 			-> 조건에 따라 조건이 맞지 않으면 한번도 실행이 안될 수도 있음 (조건을 먼저 비교)
		 *- do while문 : 먼저 실행하고 조건을 나중에 비교함. 무조건 1번은 실행됨.
		 *
		 *  for (초기화  ;  조건식  ;  증감연산식) {
		 * 	   실행문;
		 * }
		 * 초기화 -> 조건식 -> 실행문 -> 증감연산식 -> 조건식 -> 실행문-> 증감연산식 -> 조건식 -> 실행문 -> 증감연산식 -> 조건식(조건식이 false 되었을 경우 정지)
		 * 
		 * 초기화 : 실행문을 반복하기 위한 변수를 초기화 (처음 1번만 실행) : 생략 가능
		 * 조건식 : 반복을 결정하는 기능 (true=반복) : 생략가능
		 * 증감식 : 조건식에서 사용하는 변수를 증가, 감소시켜 반복횟수를 결정 : 생략 가능
		 * */
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			System.out.println("Hello~!!");
		}		
//		System.out.println(i); //for 문 안에꺼는 밖에서 사용 불가능
		
		System.out.println("-------------------------------------------------------");
		
//		int i = 0;
//		for (; i <= 5; i++) {
//			System.out.println(i);
//		}
//		System.out.println(i);
		
		System.out.println("-------------------------------------------------------");
		
		// 1~10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); // 줄바꿈
		
		System.out.println("-------------------------------------------------------");
		
		// 1~10까지 중 짝수만 출력
		// 2부터 2씩 증가
		for (int i = 2; i <= 10; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println(); // 줄바꿈
		
		System.out.println("-------------------------------------------------------");
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(); // 줄바꿈
		
		System.out.println("-------------------------------------------------------");
		
		//1~10까지의 합계 (i변수의 값을 누적하기 위해 sum 생성)
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			sum = sum + i; // 현재sum과 i의 합을 sum으로 다시 담아줘
			System.out.println(sum); // 1일때의 sum값
		}
		System.out.println(sum);
		
		System.out.println("-------------------------------------------------------");
		
		// 1~10까지의 짝수 합계
		// i++ : 1증가 i = i + 1
		sum = 0; // sum을 다시 0으로 초기화
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i; // sum += i
			}
		}
		System.out.println(sum);
		
		System.out.println("-------------------------------------------------------");
		
		// 1~10까지의 홀수 합계
		sum = 0; 
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		} 
		System.out.println(sum);
	}

}
