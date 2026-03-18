package day03;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		// Math 클래스 : 수학관련 기능이 있는 클래스
		// Math.round(값) : 반올림 소수 자리는 0
		// Math.ceil(값) : 올림 소수 자리스는 0
		// Math.floor(값) : 버림 소수 자리수는 0
		// Math.random() : 0 ~ 1 사이의 아무수를 double 리턴
		
		double num = 3.14159;

		// 반올림
		long roundNum = Math.round(num); 
		System.out.println(roundNum);
		
		long roundNum2 = Math.round(num);
		System.out.println(roundNum2);
		int roundNum3 = (int)Math.round(num); // int로 형변환
		System.out.println(roundNum3);
		
		// 올림
		double ceilNum = Math.ceil(num);
		System.out.println(ceilNum);
		int ceilNum2 = (int)Math.ceil(num); // int로 형변환
		System.out.println(ceilNum2);
		
		// 버림
		int floorNum = (int) Math.floor(num);
		System.out.println(floorNum);
		
		// Math.max (값1, 값2) / Math.min (값1, 값2)
		int n1 = 10, n2 = 20;
		System.out.println(Math.max(n1, n2)); // 최대값
		System.out.println(Math.min(n1, n2)); // 최소값
		
		System.out.println("------------------------------------------");
		
		// Math.random() 
		System.out.println(Math.random());
		// 0,0 <= Math.random() < 10
		System.out.println(Math.random()*10); // 0~9
		System.out.println((int)(Math.random()*10)); // 형변환 (정수만 나옴)
		System.out.println((int)(Math.random()*10) + 1); // 1~10
		
		// 1~6까지의 난수
		// (int) (Math.random() * count) + start => 난수를 발생시키는 공식
		System.out.println((int)(Math.random()*6) + 1); 
		
		System.out.println("------------------------------------------");
		
		// Random 클래스
		Random random = new Random();
		System.out.println(random.nextInt(10)); // 0~9까지의 난수
		System.out.println(random.nextInt(10) + 1); // 1~10까지의 난수
	}

}
