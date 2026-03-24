package day06;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// 배열
		// 숫자 5개의 값을 가지는 배열을 생성
		// 1 2 3 4 5 입력하고 출력
		
		int arr[] = new int [] {1,2,3,4,5};
		int arr2[] = new int [5];
		
		for (int i = 0; i < arr.length; i++) { // 값이 들어있을 경우
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) { // 값이 없을 경우
			arr2[i] = i + 1;
			System.out.println(arr2[i]);
		}
		
		System.out.println();
		
		for (int tmp : arr) {
			System.out.println(tmp);
		}
		
		System.out.println();
		
		for (int tmp : arr2) {
			System.out.println(tmp);
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr2));
		
		
		
	}

}
