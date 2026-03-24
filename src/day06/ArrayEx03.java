package day06;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 점수배열 [10] 생성후
		// 1~10 저장 후 출력
		int arr[] = new int [5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 섞기
		
		for(int i = 0; i < arr.length; i++) { // i는 번지
			
			// 번지를 랜덤으로 생성 0~9
			int index = (int)(Math.random()*arr.length);
//			System.out.println(index);
			
			// 교환
			int t = arr[i];
			arr[i] = arr[index];
			arr[index] = t;
			
		}
		System.out.println(Arrays.toString(arr));
		
		// 원래대로 정렬 (선택정렬방법)
		// 작운수부터 정렬 => 오름차순
		// 큰수부터 정렬 => 내림차순
		// [5, 4, 3, 1, 2]
		
		//if (앞 > 뒤) (교환;)
//		for (int i = 0; i < arr.length-1; i++) { // i는 번지
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					// 교환
//					int t = arr[i];
//					arr[i] = arr[j];
//					arr[j] = t;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
		// Arrays.sort : 오름차순
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
