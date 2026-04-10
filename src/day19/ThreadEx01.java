package day19;

class Bank1{
	private int money = 10000;
	
	// 입금
	public synchronized void saveMoney(int money) {
		this.money += money;
		System.out.println(Thread.currentThread().getName() +
				"입금 : " + money + "/ 잔액 : " + this.money);
		// 대기 중인 스래드 깨움
		notifyAll();
	}
	
	// 출금
	public synchronized void minusMoney (int money) {
		// 잔액이 부족하면 기다림
		while (this.money < money) { // while 인 이유 => 깨어났을 때 조건을 다시 확인 필요
			System.out.println(Thread.currentThread().getName() + 
					"출금대기 (잔액부족) / 현재 잔액 : " + this.money);
			
			try {
				
				wait(); // 여기서 대기
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.money -= money;
		System.out.println(Thread.currentThread().getName() + 
				"출금 : " + money + " / 잔액 : " + this.money);
	}
	 
}

public class ThreadEx01 {

	public static void main(String[] args) {
		// 은행 클래스에서 출금시 잔액이 부족하면 실패 => 대기(wait)
		// 입금이 발생하면 다시 깨어남 (notify) => Thread 깨움(notify)
		
		/* wait() 
		 *  - 스레드를 대기 상태로 보냄
		 *  - 반드시 stnchronized 내부 에서만 사용 가능
		 *  - lock을 반납하고 기다름
		 *  
		 * notify()
		 *  - wait중의 스레드를 하나 깨움
		 *  
		 * notifyAll()
		 *  - wait 중인 스레드를 모드 깨움 => 사용
		 * */
		Bank1 bank = new Bank1();
		
		DepositThread hong = new DepositThread("hong", bank);
		
		WithdrawThreadd wife = new WithdrawThreadd("hongWife", bank);
		
		hong.start();
		wife.start();
	}

}

// 입금 Thread
class DepositThread extends Thread{
	private Bank1 bank;
	
	public DepositThread(String name, Bank1 bank) {
		super(name); // 
		this.bank = bank;
	}

	@Override
	public void run() {
		// 입금 5번 반복
		for (int i=0; i<5; i++) {
			bank.saveMoney(10000);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

// 출금 Thread
class WithdrawThreadd extends Thread{
	
	private Bank1 bank;
	
	public WithdrawThreadd(String name, Bank1 bank) {
		super(name); // 
		this.bank = bank;
	}

	@Override
	public void run() {
		// 입금 5번 반복
		for (int i=0; i<5; i++) {
			bank.minusMoney(20000);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

