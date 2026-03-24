package day06;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		// String 배열
		
		String [] strArr = new String[5];
		
		strArr[0] = "홍길동";
		strArr[1] = "박순이";
		strArr[2] = "김영이";
		strArr[3] = "황영이";
		strArr[4] = "고길동";
		
		System.out.println(Arrays.toString(strArr));
		
		for (String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------");
		
		// 배열은 크기가 고정
		String [] arr = new String[5];
		arr[0] = "홍길동";
		
		System.out.println(Arrays.toString(arr));
		
		for (String s : arr) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------");
		
		// 배열에 데이터를 줄이거나 늘리고 싶을 경우
		String arr2[] = new String[6]; // 임시로 생성
		System.out.println(Arrays.toString(arr2));
		
//		// strArr 5개 있는 데이터를 arr2으로 이동
//		// 받을대상 = 옮길대상
//		for (int i = 0; i < strArr.length; i++) {
//			arr2[i] = strArr[i];
//		}
//		System.out.println(Arrays.toString(arr2));
//		
//		strArr = arr2;
//		System.out.println(Arrays.toString(strArr));

		System.out.println("------------------------------");
		
		// 배열복사
		// System.arraycopy(구배열, 시작번지, 신배열, 시작번지, 개수)
		// System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		System.arraycopy(strArr, 0, arr2, 0, strArr.length);
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(strArr));
		
		strArr = arr2; // 새 배열로 배열 주소 연결
		strArr[5]="바둑이";
		System.out.println(Arrays.toString(strArr));
	}

}
