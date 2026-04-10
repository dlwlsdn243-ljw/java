package day19;

public class Thread02 {
	public static void main(String[] args) {
		// Runnable 로 구현하는 방법
		
		System.out.println(Thread.currentThread().getName()); // main
		
		System.out.println("main Thread statr!!!!!!!!");
		
		// interface로 구현한 스레드 객체는 Thread의 객체가 없어서 실행이 안됨.
		// Thread 객체를 생성해서 넣어줘야 함
		mythread2 th2 = new mythread2();
		Thread t = new Thread(th2);
		t.start();
		
		// join() : 스레드가 실행을 마칠 때까지 스레드를 대기상태로 만듬
		// sleep() : 일정시간동안 스레드를 중지하고 대기상태로 만듬
		try {
			
			t.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Thread t2 = new Thread(new mythread2());
		t2.start();
		
		try {
			
			t2.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("main Thread end!!!!!!!!!!!!!");
	}

}

class mythread2 implements Runnable{

	private int start;
	
	@Override
	public void run() {
		// 반드시 구현되어야 함.
		for (int i=0; i<2000; i++) {
			System.out.println(i+". Thread > " + Thread.currentThread().getName());
		}
		
	}
	
}
