package coffee;

public enum Option {
	shot(500),
	whipped_cream(700),
	syrup(0);
	
	private final int option;
	
	Option(int option){
		this.option = option;
	}

	public int getOption() {
		return option;
	}
	
}
