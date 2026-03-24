package day05;

public class Array03 {

	public static void main(String[] args) {
		// 합계와 평균을 구해주세요.
		
		int arr[] = {65, 45, 12, 98, 15, 75, 65, 32};
		
		
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		avg = sum / (double)arr.length;
		System.out.println(avg);
		
		System.out.println("------------------------------------------------------");
		
		int max = 0;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} 
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		System.out.println("------------------------------------------------------");
		
		// 최대값 , 최소값
		max = 0;
		min = 100;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max,arr[i]);
			min = Math.min(min,arr[i]);
		}
		System.out.println(max);
		System.out.println(min);

	}

}
