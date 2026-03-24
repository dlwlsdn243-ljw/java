package day06;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		/* ArrayCopy
		 * 배열은 길이가 정해져 있음.
		 * 처음 배열을 선언할 때 정새어 생성
		 * 이후 배열을 증가 / 감소 할수 없음. (필요에 의해 늘이거나 줄일 수 없음.)
		 * 배열의 길이를 저절해야 할 때 ArrayCopy를 이용
		 * 
		 * System.arraycopy (이전배열, 시작번지, 새배열, 시작번지, 개수);
		 * 이전배열 = 새배열;
		 * */
		int [] arr = new int [5];
		
		arr[0] = 78;
		arr[1] = 48;
		arr[2] = 56;
		arr[3] = 69;
		arr[4] = 23;
		
		System.out.println(Arrays.toString(arr));
		
		// 새 배열 생성 기존배열에 5개 추가		
		int [] arr2 = new int [arr.length + 5];
		
		// 데이터 복사후 주소 공유
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		arr = arr2;
		
		// 출력
		System.out.println(Arrays.toString(arr));
	}

}
