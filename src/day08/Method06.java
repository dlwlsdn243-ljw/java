package day08;

import java.util.Arrays;
import java.util.Random;

public class Method06 {
	// 맴버변수
	Random random = new Random(); // 다른 곳에서도 사용 가능
	/* 1. 랜덤수 (0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 => 정수타입 int[]
	 * 매개변수 : 없음
	 * 리턴타입 : int[]
	 * */
	public int[] Random() {
//		Random random = new Random(); // 여기서만 사용
		int arr [] = new int [5];
		for (int i=0; i<arr.length; i++) {
			arr[i] = ((int)(Math.random()*100) + 1);	
			arr[i] = random.nextInt(100);
		}
		return arr;
	}
	
	/* 2. 정수 배열을 매개변수로 받아 평균값을 리턴하는 메서드
	 * 매개변수 : int[] arr
	 * 리턴타입 : double
	 * */
	public double arr2(int[] Random) {
		int sum = 0;
		for(int i=0; i<Random.length; i++) {
			sum += Random[i];
		}		
		return sum/(double)Random.length;
	}
	
	/* 3. 정수 배열을 매개변수로 받아 출력하는 메서드
	 * 매개변수 : int[] arr
	 * 리턴타입 : void
	 * */
	
	public void arr3(int[] Random) {
		for (int num : Random) {
			System.out.print(num + " ");
		}
		System.out.println(); //enter(줄바꿈)
//		System.out.print(); // 줄바꿈이 없는 출력
	}

	public static void main(String[] args) {
		// 메서드 배열 활용
		/* 1. 랜덤수 (0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 => 정수타입 int[]
		 * 2. 정수 배열을 매개변수로 받아 평균값을 리턴하는 메서드
		 * 3. 정수 배열을 매개변수로 받아 출력하는 메서드
		 * */
		Method06 m6 = new Method06();
		// 메서드 호출
		
		 int arr[] = m6.Random();
		 arr = m6.Random();
		 // 출력
		 m6.arr3(arr); 
		 
		 System.out.println(m6.arr2(arr));
		 // 평균 출력
	}

}
