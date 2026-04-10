package coffee;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
	// 주문 리스트 관리 클래스
	private List<Order> orders = new ArrayList<>();
	
	public void addOrder (Order order) {
		orders.add(order);
	}
	
	// 전체 주문 금액
	public int getTotalSales() {
		return orders.stream()
				.mapToInt(Order :: getTotalPrice)
				.sum();
	}
	
	// 전체 주문 출력
	public void printAllOrders() {
		orders.forEach(Order :: printOrder);
	}
}
