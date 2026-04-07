package day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClass02 {

	public static void main(String[] args) {
		// List의 정렬 sort
		/* 리스트 생성
		 * 1~100까지 랜덤수를 10개 만들어 리스트에 채우기
		 * 출력
		 * */
		List<Integer>list = new ArrayList<>();
		
		for (int i=1; i<=10; i++) {
			list.add((int)(Math.random()*100)+1);
			
		}
		System.out.println(list);
		
		// Collections.sort(list); // collections 클래스에서 제공하는 메서드
		
		// list.sort(comparator를 구현한 구현객체) : 정렬이 가능
		// comparator 인터페이스를 구형한 구현체를 넣어야 함. (익명클래스 사용)
		// compare   
		// compareTo 사전상으로 앞에있으면 - 같으면 0 뒤에있으면 +
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// 숫자 - 빼보면 앞에수가 작으면 - / 앞에수가 크면 +
				// 앞의 수가 작으면 앞으로 보내 : 오름차순 o1-o2
				// 앞의 수가 크면 뒤로 보내 : 내림차순 o2-o1
				// 연산의 결과가 -면 앞으로 보내고, +면 뒤로 보내는 역할
				return o2 - o1;
			}
		});
		System.out.println(list);
		
		List<String>list2 = new ArrayList<>();
		
		list2.add("apple");
		list2.add("kiwi");
		list2.add("banana");
		list2.add("orange");
		
		System.out.println(list2);
		
		list2.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// compareTo 사전상으로 앞에있으면 - 같으면 0 뒤에있으면 +
				// o1.compareTo(o2) : 오름차순
				// o2.compareTo(o1) : 내림차순
				return o1.compareTo(o2);
			}
		});
		System.out.println(list2);
	
		


	}

}
