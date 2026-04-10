package coffee;

public enum Size {
	SMALL(0),
	MEDIUM(500),
	LARGE(1000);
	
	private final int extraprice;
	
	Size(int extraprice){
		this.extraprice = extraprice;
	}

	public int getExtraprice() {
		return extraprice;
	}


	
}
