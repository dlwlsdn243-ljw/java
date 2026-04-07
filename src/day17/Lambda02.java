package day17;

import java.util.HashMap;
import java.util.Map;

public class Lambda02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		
		map.put("hong", 89);
		map.put("kim", 78);
		map.put("lee", 58);
		map.put("choi", 69);
		map.put("park", 57);
		
		map.forEach((a,b) -> {
			System.out.println(a+":"+b);
		});
		
		// 함수형인터페이스 구현
		
//		Number sum = (a, b) -> {
//			return a+b;
//		};
//		
//		int s = sum.add(100, 200);
//		System.out.println(s);
		
		Number max = (a,b) -> {
			return (a>=b) ? a : b;
		};
		
		int m = max.max(100, 200);
		System.out.println(m);

	}

}


// 람다용 함수형 인터페이스 생성 => @FunctionalInterface
// 메서드가 1개만 가능
@FunctionalInterface
interface Number{
	// 메서드 추가 : 1개만
	// int add(int a, int b);
	int max(int a, int b); // 메서드가 2개면 error 
}
