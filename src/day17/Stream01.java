package day17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream01 {

	public static void main(String[] args) {
		// Stream(스트림) : 자료를 복사하여 생성
		/* - 스트림은 1회용, 쓰고나면 소모됨. (재사용 불가능)
		 * - 스트림을 이용한 연산을 수행
		 * - 연산을 수행한 스트림은 소모됨. 
		 * - 스트림은 복사본이기 때문에 기존 자료를 변경하는 구문은 사용불가능
		 * - 메서드 체이닝 방식을 사용
		 * - 스트림만의 연산을 가지고 있음. 
		 * 
		 * 중간연산 / 최종연산
		 * - 최종연산 (마지막에 하나만)
		 * forEach() : 리스트를 순회하며 요소값을 얻어 내는 역할
		 * findFirst() : 조건에 일치하는 요소 중 가장 앞에있는 요소 리턴
		 * findAny() : 조건에 일치하는 요소 중 가장 먼저 탐색되는 요소 리턴
		 * anyMatch() : 조건에 맞는 요소가 하나라도 있다면 true 리턴
		 * allMatch() : 모든 요소가 조건에 맞다면 true 리턴
		 * noneMatch() : 조건에 맞는 요소가 없다면 true 리턴
		 * count(), min(), max() : 개수, 최소값, 최대값 리턴
		 * sum(), average() : 합계, 평균 리턴
		 * collect() : 스트림 내의 요소를 수집하여 사용자가 원하는 형태로 반환
		 * toArray() : 배열로 리턴
		 * toList() : 리스트로 리턴
		 * ...
		 * 
		 * - 중간연산 (중간에 이어서 사용 중복사용도 가능)
		 * filter() : 조건에 맞는 결과값을 필터링
		 * distinct() : 중복된 값 제거
		 * map() : 요소의 값을 원하는 값으로 변환 => 형변환
		 * sorted() : 정렬
		 * peek() : 작업 수행 후 스트림 리턴
		 * skip() : 스트림의 일부를 건너 뜀
		 * limit() : 스트림의 일부를 잘라냄 
		 * */
		
		int arr[] = {1,2,5,4,8,9,6,5,8,2,3,6,1,4,5};
		int sum = 0;
		for(int i: arr) {
			sum += i;
		}
		
		System.out.println(sum);
		
		System.out.println("stream을 이용한 합계구하기");
		// 배열을 스트림으로 구성
		int s = Arrays.stream(arr).sum();
		System.out.println(s);
		
		// 스트림은 한번 구성 후 소모되기 때문에 굳이 변수로 저장안함.
		IntStream is = Arrays.stream(arr);
		int s1 = is.sum(); // 한번 실행하면 소모되어 쓸수 없음. 
		System.out.println(s1);
		
//		int s2 = is.sum(); // error
//		System.out.println(s2);
		
		System.out.println("----");
		
		// count()
		long c = Arrays.stream(arr).count();
		System.out.println(c);
		
		// average()
		// Optional : null 방지용
		OptionalDouble od = Arrays.stream(arr).average();
		System.out.println(od.getAsDouble());
		
		// 합계 5이상인 값만 합계
		int s2 = Arrays.stream(arr).filter(n -> n>=5).sum();
		System.out.println(s2);
		
		// IntStream을 이용하여 조건에 맞는 값만 추출 => List로 리턴
		List<Integer> list = Arrays.stream(arr)
				.filter(n -> n>=5)
				.boxed() // IntStream => Stream<Integer>
				.collect(Collectors.toList());
		System.out.println(list);
		
		// IntStream을 이용하여 조건에 맞는 값만 추출 => array로 리턴
		int[] arr2 = Arrays.stream(arr)
				.filter(n -> n<5)
				.toArray();
		System.out.println(Arrays.toString(arr2));
		
		
		boolean any = Arrays.stream(arr)
				.anyMatch(n -> n==7);
		System.out.println(any);
		
		
		OptionalInt oi = Arrays.stream(arr)
				.filter(n -> n>5)
				.findFirst();
		System.out.println(oi.getAsInt());
		
		int[] arr3 = Arrays.stream(arr)
				.distinct()  // 중복 제거
				.sorted()	// 정렬
				.toArray();
		System.out.println(Arrays.toString(arr3));
		
	}

}