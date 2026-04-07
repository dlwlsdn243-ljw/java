package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		// Lambda (람다식, 람다함수) : 익명함수를 지칭하는 용어
		// 람다 표현식 (->) 함수 몸체로 이용하여 사용할 수 있다.
		// 함수 몸체가 단일 실행문이면 {} 생략 가능
		// 함수 몸체가 return문이 구성되어있다면 {} 생략 불가능
		
		// 람다 표현식
		//  (매개변수) -> {처리구문}
		
		/* lambda : 외부 자료의 부수적인 영향을 주지 않도록 구현한 방식
		 * stream : 자료의 대상과 상관없이 동일한 연산을 수행할 수 있도록
		 * 구성해주는 반복자
		 * - 메서드 체이닝 기법을 사용
		 * 
		 * - 람다 장점 : 코드 간결성, 병렬처리 가능, 불필요한 연산의 최소화
		 * - 람다 단점 : 가독성이 떨어짐, 반복문 사용시 성능 저하
		 * 
		 * - 람다 표현식
		 * (매개변수) -> {구현}
		 * - 매개변수가 1개면 () 생략가능
		 * a -> {return a+1;}
		 * (a,b) -> {return a+b;}
		 * 
		 * - return 이 없는 경우 {} 생략가능
		 * (a,b) -> a+b;
		 * a -> return a;  // 오류
		 * 
		 * */
		
		String a = "abcdef@naver.com";
		// 메서드 체이닝 방식
		a.substring(0, 5).concat("111111").charAt(0);
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println("--람다식--");
		list.forEach(n -> {System.out.println(n); });
		
		Consumer<Integer> method01 = (n)->{
			System.out.print(n+" ");
		};
		
		System.out.println("--Consumer 를 활용한 출력--");
		list.forEach(method01);

	}

}