package coffee;

public enum Coffee {
	AMERICANO(3000),
	LATTE(4000),
	CAPPUCCINO(4500),
	MOCHA(5000);
	
	private final int price;
	
	Coffee(int price){  // 생성자 필수!!  중요!!
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
}