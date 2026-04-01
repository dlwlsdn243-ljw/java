package day10;

public class CandPack {
	/* 52장의 Card를 배열로 저장(pack)
	 * 
	 * - 맴버변수 : 52장의 Card담을 수 있는 배열 + 번지
	 * - 메서드
	 * 1. 카드를 섞는 기능
	 * 2. 카드를 한 장 빼내는 기능(유저에게 주는 기능)
	 * 3. 카드 초기화 기능(나눠준 카드 회수)
	 * 
	 * 생성자 : 
	 * */
	
	private Card[] pack = new Card[52]; //52개 카드
	private int index; // 52개 카드의 번지
	
	
	public CandPack() { 
		String shape[] = {"♥", "◆", "♣", "♠"};
		
		for(int i=0; i<shape.length; i++) {
			for(int j=1; j<=13; j++) {
				
				Card card = new Card(); // 카드1장 생성
				
				card.setShape(shape[i]);
				card.setNum(j);
				pack[index] = card;
				index++;
			}
		}
	}
	
	// 섞는 기능
	public void shuffle() {
		for (int i=0; i<pack.length; i++) {
			int random = (int)(Math.random()*pack.length);
			
			// 교환
			Card tep = pack[i];
			pack[i] = pack[random];
			pack[random] = tep;
		}
	}
	
	// 하나씩 나눠주는 기능
	// 리턴타입 : Card
	public Card pick() {
		if(index == 0) {
			return null;
		}
		index--;
		return pack[index];
		
	}
	
	// 초기화
	// index 번지를 원래대로 회복 52
	public void init() {
		index = 52;
		shuffle();
	}
	

	
	public Card[] getPack() {
		return pack;
	}
	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	
}
