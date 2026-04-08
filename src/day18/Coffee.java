package day18;

public enum Coffee {
	AMERICANO(2000),
	LATTE(3800),
	CAPPUCCINO(4500),
	MOCHA(4300);
	
	private final int price;
	
	Coffee(int price){  // 생성자 필수!!  중요!!
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
}