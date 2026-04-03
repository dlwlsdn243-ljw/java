package costomExcepion;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product apple = new Product("사과", 1000, 10);
		
		StoreController sc = new StoreController();

		Order order1 = new Order(apple, 20); //사과 20개 주문
		sc.sell(order1);
		System.out.println(order1.getProduct().getStock());
		
		
		Order order2 = new Order(apple, 5); //사과 5개 주문
		sc.sell(order2);
		
		Order order3 = new Order(apple, 5); //사과 5개 주문
		sc.sell(order3);
		
		Order order4 = new Order(apple, 5); //사과 5개 주문
		sc.sell(order4);
		
		System.out.println("총매출:"+sc.getTotalSales());

	}

}