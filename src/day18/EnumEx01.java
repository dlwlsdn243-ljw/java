package day18;

import java.util.ArrayList;
import java.util.List;

public class EnumEx01 {

	public static void main(String[] args) {
		// 커피숍 메뉴(가격)을 enum 클래스로 생성
		
		// 주문 클래스 커피에대한 메뉴(enum 클래스), 수량, 가격 => 출력
		
		// 메인에서 커피메뉴 주문 => 출력
		
		List<Order> orderList = new ArrayList<>();
		
		Order o1 = new Order(Coffee.AMERICANO, 2);
		Order o2 = new Order(Coffee.LATTE, 1);
		Order o3 = new Order(Coffee.MOCHA, 2);
		
		orderList.add(o1);
		orderList.add(o2);
		orderList.add(o3);
		
//		System.out.println(o1);
//		System.out.println(o2);
//		System.out.println(o3);
//		
//		int sum = o1.getTotalPrice()+o2.getTotalPrice()+o3.getTotalPrice();
//		
//		System.out.println("총 지불금액:"+sum);
		
		orderList.stream().forEach(System.out::println);
		
		int sum = orderList.stream()
				.mapToInt(Order :: getTotalPrice)
				.sum();
		
		System.out.println("총 지불금액:"+sum);
		

	}

}