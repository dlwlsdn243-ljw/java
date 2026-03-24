package day06;

public class Array05 {

	public static void main(String[] args) {
		/* 10개의 숫자를 가지는 배열 생성
		 * 1~50까지 랜덤수를 배열에 저장 => 출력
		 * 최대, 최소, 합계, 평균 출력
		 * */
		
		int arr[] = new int [10];
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 51;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ((int)(Math.random()*50) + 1);
			System.out.println(arr[i]);
			sum = sum + arr[i];
			avg = (double) sum / arr.length;
			max = Math.max(max,arr[i]);
			min = Math.min(min,arr[i]);
		} 
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
//		for (int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			
//			if (min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		
//		System.out.println();
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + sum / (double)arr.length);
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
	}

}
