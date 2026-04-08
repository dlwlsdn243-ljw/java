package coffee;

public enum Size {
	small(0),
	medium(500),
	large(1000);
	
	private final int size;
	
	Size(int size){
		this.size = size;
	}

	public int getSize() {
		return size;
	}
	
}
