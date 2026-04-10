package day19;

public class Thread04 {

	// 계좌의 객체 생성 영역 : 공유영역으로 생성 (static)
	public static Bank myBank = new Bank();
	
	
	
	public static void main(String[] args) {
		// critical section (임계영역 : 공유영역)
		
		/* 두 개 이상의 Thread가 동시에 접근할 수 있는 구역
		 * 동시 여러개의 Thread가 공유영역의 값을 가지려고 하면 충돌이 발생할 수 있음
		 * 교착상태 (deadlock)
		 * 한 시점에 하나의 Thread만 사용가능 : 세마포어(semaphore)
		 * 세마포어를 얻은 스레드만 접근 가능 => 나머지는 대기상태가 됨
		 * 
		 * 동기화 (순서화) : synchronized
		 * 동기화가 필요한 메서드 앞에 키워드로 선언
		 * */

		
		/* 홍길동 => 입금 / 홍길동 부인 => 출금
		 * Bank 클래스 생성
		 * 계좌 1개 생성 : 급여통장 => 공유영역 (static)
		 * 홍길동(Gong) / 부인 (HongWife)
		 * 잔액 : 500000
		 * 
		 * 입금 : saveMoney(동기화)
		 *
		 * 출금 : minusMoney(동기화)
		 * */

		System.out.println("--Bank 시작--");
		System.out.println("현재 잔액 : " + Thread04.myBank.getMoney());
		

		
		HongWife hongWife = new HongWife();
		hongWife.start();
		
		Hong hong = new Hong();
		hong.start();
		
	}

}


class Bank{
	private int money = 500000;
	
	// 입금 (동기화)
	public synchronized void saveMoney(int money) {
		int m = this.money;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.money += money;
	}
	
	// 출금 (동기화)
	public synchronized void minusMoney(int money) {
		int m = this.money;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.money -= money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}


class Hong extends Thread{

	@Override
	public void run() {
		// 입금
		System.out.println("홍길동님 > 100,000원 입금");
		Thread04.myBank.saveMoney(100000);
		System.out.println("잔액 > " + Thread04.myBank.getMoney());
		
		
	}
	
}


class HongWife extends Thread{

	@Override
	public void run() {
		// 출금
		System.out.println("홍길동부인님 > 50,000원 출금");
		Thread04.myBank.minusMoney(50000);
		System.out.println("잔액 > " + Thread04.myBank.getMoney());
	}
	
	
}
