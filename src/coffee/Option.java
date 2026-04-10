package coffee;

public enum Option {
	SHOT(500),
	SYRUP(0),
	WHIPPED_CREAM(700);
	
	private final int optionPrice;
	
	Option(int optionPrice){
		this.optionPrice = optionPrice;
	}

	public int getOptionPrice() {
		return optionPrice;
	}
	
}
