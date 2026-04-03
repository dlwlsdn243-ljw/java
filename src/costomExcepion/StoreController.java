package costomExcepion;

public class StoreController {
	
	private int totalSales = 0; // 판매금액 
	
	public void sell(Order order) {
		Product product = order.getProduct();
		
//		if(order.getCount() > product.getStock()) {
//			throw new OutOfStockException("재고가 부족합니다.");
//		}
		
		// 재고감소
		try {
			product.decreaseStock(order.getCount());
			
			// 매출 증가
			totalSales += order.getTotalPrice();
			
			System.out.println("판매완료 => "+product.getName() +"재고: "+ product.getStock());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public int getTotalSales() {
		return totalSales;
	}

}