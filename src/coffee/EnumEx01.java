package coffee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import word.Word;

public class EnumEx01 {

	public static void main(String[] args) throws IOException {
		// 커피숍 메뉴(가격)을 enum 클래스로 생성
		
		// 주문 클래스 커피에대한 메뉴(enum 클래스), 수량, 가격 => 출력
		
		// 메인에서 커피메뉴 주문 => 출력
		
		List<Order> orderList = new ArrayList<>();
		
		Order o1 = new Order(Coffee.AMERICANO, 2, Size.small, Option.shot);
		Order o2 = new Order(Coffee.LATTE, 1, Size.medium, Option.syrup);
		Order o3 = new Order(Coffee.MOCHA, 2, Size.large, Option.whipped_cream);
		Order o4 = new Order(Coffee.CAPPUCCINO, 3, Size.medium, Option.shot);
		
		orderList.add(o1);
		orderList.add(o2);
		orderList.add(o3);
		orderList.add(o4);
		
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
		
		System.out.println("총 지불금액 : "+sum);
		
		System.out.println("파일로 저장합니다.");
		final String fileName = "D:\\java_260403_ljw\\memo\\coffee.txt";
		
		BufferedWriter bw = 
				new BufferedWriter(new FileWriter(fileName));
		
		StringBuffer sb = new StringBuffer();
		// \n : 줄바꿈.
		sb.append("--coffee--\r\n");
		int cnt = 0;
		for (Order w : orderList) {
			cnt++;
			sb.append(cnt);
			sb.append(", ");
			sb.append(w); // toString 모양대로 출력
			sb.append("\r\n");
		}
		bw.write(sb.toString()); // StringBuffer객체를 String객체로 변경

		
		bw.close();
		

	}

}