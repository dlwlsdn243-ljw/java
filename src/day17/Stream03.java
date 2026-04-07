package day17;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stream03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,5,4,7,8,5,6,3,2,5,6,9,8,5,2,1,6};
		
		// 스트림으로 구성하여 중복제거하고 정렬하여 짝수만 출력
		Arrays.stream(arr)	
			.distinct()
			.sorted()
			.filter(n -> n%2 ==0)
			.forEach(n -> System.out.print(n+" "));
		
		// 스트림으로 구성하여 중복제거하고 정렬하여 홀수만 배열로 리턴
		int arr2[] = Arrays.stream(arr)
				.distinct()
				.sorted()
				.filter(n -> n%2 ==1)
				.toArray();
		System.out.println(Arrays.toString(arr2));
	}

}
