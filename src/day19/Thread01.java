package day19;

public class Thread01 {

	public static void main(String[] args) {
		// Thread(쓰레드) : 실제 작업을 수행하는 곳
		/*  - 프로그램이 실행되면 운영체제로 부터 메모리를 할당받아 process의 상태가 됨
		 *  - Thread란 실제 CPU가 작업을 처리하는 단위
		 *  - multi-Thread : 여러개의 Thread가 동시에 수행되는 프로그램
		 *  - CPU는 시간을 잘게 쪼개서 Thread들을 번갈아 수행함.(시분할 처리)
		 *  - 사용자들은 동시에 처리되는 듯한 효과를 가지게 됨
		 *  
		 *  - Thread들은 각자의 자신만의 작업 공간을 가진다.(context)
		 *  - 여러 Thread들이 같이 공유하는 자원도 있음
		 *  - 여러 Thread들이 공유된 자원을 사용하려고 경쟁이 발생함
		 *  - 그 경쟁 구역을 critical section (임계영역)
		 *  - critical section내에서의 충돌 (고착생태 : deadIock)
		 *  - 충돌이 발생하지 않도록 동기화(순차처리) 통해서 오류를 마음
		 *  
		 *  - Thread 상태변화
		 *  - 생성 (new) -> 준비(Runnable) -> 실행(Running)
		 *   -> 대기(Waiting / Blocked) -> 준비 -> 실행 반복 -> 종료 
		 * */
		
		/* Thread 구형 방법 2가지
		 * 1. Thread 클래스를 상속하여 만들기
		 * 2. runnable 인터페이스를 구현하여 만들기
		 *   - 자바는 다중 상속을 여용하지 않음.
		 *   - 만약 클래스가 상속중이라면 인터페이스 구현을 통해 구성함
		 * 
		 * */
		
		System.out.println("------------threed start!!!!!!!!!!!!!!!!!!");
		// 현재 실행중인 스래드 이름
		System.out.println(Thread.currentThread().getName()); // main
		
		myThread th = new myThread(); // Thread - 0
		// start() => run() 메서드 호출
		// .run x => start()
		th.start();
		
		myThread th2 = new myThread(); // Thread - 1
		th2.start();
		System.out.println("------------threed end!!!!!!!!!!!!!!!!!!");
		
	}

}

class myThread extends Thread {
	
	// 상속시 nun() 메서드를 구현햐야 함
	@Override
	public void run() {
		// 내가 하고 싶을 일 수행
		for (int i=0; i<2000; i++) {
			System.out.println(i+". Thread > " + getName());
		}
	}
	
}
