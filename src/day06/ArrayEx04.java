package day06;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 정수배열[10] => 1~100까지의 랜덤수 저장 => 출력
		// 오름차순 정렬 => 출력
		
//		int arr[] = new int [10];
		Integer arr[] = new Integer [10];
		
		for (int i = 0; i < arr.length; i++) {
			int index = (int)(Math.random()*100) + 1;

//			int t = arr[i];
			arr[i] = index;
			index = i;
		} System.out.println(Arrays.toString(arr));
		
		
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = i+1; j < arr.length; j++) { // int j = i+1; => i다음 번지부터
//				if (arr[i] > arr[j]) {
//					int t = arr[i];
//					arr[i] = arr[j];
//					arr[j] = t;
//				}
//				
//			}	
//		}
//		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); // 오름차순
		System.out.println(Arrays.toString(arr));
		
		//내림차순 정렬 방법 => Object (모든 객체의 부모)
		// 기본 자료형은 불가능. => Object 형태로 boxing (레퍼클레스로)
		// 		Collections.reversOrder()
		// wrapper class => 래퍼클래스 => 기본 타입의 자료형을 클래스 박싱(포장) 해서 객체로 만드는 것
		// int => Integer
		// byte => Byte
		// char => Character
		// float => Float
		// double => Double
		// long => Long
		// short => Short
		// boolean => Boolean
		
		// Arrays.sort(arr,Collections.reversOrder());
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

}
