package day08;

public class Exam02 {
	
	/* 1. 배열을 매개변수로 받아 랜덤수로 채워주는 메서드
	 * 매개변수 : 배열 => int[] arr
	 * 리턴타입 : void => 매개변수의 배열을 채우는 ...
	 * */
	public void randomArray(int[] arr) {
		// 랜덤 값을 넣을 때 중복을 제거하고 채우기.
		int cnt=0;
		while(cnt < arr.length) {
			int random = (int)(Math.random()*10)+1;
			if(!isContains(arr, random)) {
				arr[cnt] = random;
				cnt++;
			}
		}
	}
	
	/* 1-1. 중복 확인 메서드
	 * 매개변수 : 배열, 값 => int[] arr, int random
	 * 리턴타입 : boolean => true / false
	 * */
	public boolean isContains(int[] arr, int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == random) {
				return true;
			}
		}
		return false;
	}
	
	/* 2. 배열 출력 메서드
	 * 매개변수 : 배열 => int[] arr
	 * 리턴타입 : void => 출력
	 * 1 2 3 4 5 6  => user
	 * 1 2 3 4 5 6 [7] => lotto
	 * */
	public void printArray(int[] arr) {
		for(int i=0; i<6; i++) {
			System.out.print(arr[i]+" ");
		}
		if(arr.length == 7) {
			System.out.print("["+arr[arr.length-1]+"]");
		}
		System.out.println();
	}
	
	/* 3. 당첨확인 메서드
	 * 매개변수 : 배열 2개 => int[] user, int[] lotto
	 * 리턴타입 : int => 등수 리턴
	 * */
	public int lottoRank(int[]user, int[] lotto) {
		// user / lotto 위치가 바뀌어서 들어오면 exception
		if(user.length >= lotto.length) {
			//System.out.println("배열이 잘못들어왔습니다.");
			return -999;
		}
		
		int count = 0; // 일치 개수 카운트 (보너스는 제외)
		for(int i=0; i<user.length; i++) {
			if(isContains(user, lotto[i])) {
				count++;
			}
		}
		System.out.println(count);
		
		//순위
		int bonus = lotto[lotto.length-1]; // 보너스 번호 추출
		
		switch(count) {
		case 6:  return 1;
		case 5:  return isContains(user, bonus) ? 2 : 3;
//			if(isContains(user, bonus)) {
//				return 2;
//			}
//			return 3;
		case 4:  return 4;
		case 3:  return 5;
		default: return -1;
		}
		
	}
	

	public static void main(String[] args) {
		/* 로또 번호 생성 => 당첨여부
		 * user 번호 6개
		 * 1~45까지 번호 중 6개 선택 (랜덤 자동선택)
		 * 1, 2, 3, 4, 5, 6 
		 * 
		 * 당첨번호 7개 => 6개 + 보너스번호
		 * 1, 2, 3, 4, 5, 6 [7]
		 * 
		 * 유저번호와 당첨번호는 중복 불가능
		 * 당첨여부 확인
		 * 
		 * 6개 일치 = 1등 (순서는 상관없고, 보너스 제외)
		 * 5개 일치 + 보너스번호 = 2등
		 * 5개 일치 = 3등
		 * 4개 일치 = 4등
		 * 3개 일치 = 5등
		 * 나머지 꽝
		 * */
		
		int[] user = new int[6]; // 사용자 번호 (자동)
		int[] lotto = new int[7]; // 당첨번호 (자동)
		
		Exam02 e = new Exam02();
		e.randomArray(user);
		e.randomArray(lotto);
		e.printArray(user);
		e.printArray(lotto);
		
		// 등수 리턴 -999 (배열오류) -1 꽝
		int ranking = e.lottoRank(user, lotto);
		if(ranking == -999) {
			System.out.println("배열 오류입니다.");
		}else if(ranking == -1) {
			System.out.println("꽝~!!");
		}else {
			System.out.println("축~!! "+ranking+"등 당첨!!");
		}
		
	}

}