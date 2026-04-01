package day11;

public class Mathod08 {
	
	public int sum (int ... num) { // ...num => num를 배열로 인식
		int result = 0;
		for(int tmp : num) {
			result += tmp;
		}
		return result;
	}

	public static void main(String[] args) {
		// 가변인자 메서드
		// - 매개변수의 개수가 고정되어 있지 않을 경우.
		
		Mathod08 m8 = new Mathod08();
		System.out.println(m8.sum(1,2,3,4,5,6,7,8,9,10));
		System.out.println(m8.sum(1,2,3,4,5,6));
	}

}
