package day14;

public class PasswoedException extends IllegalArgumentException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* 사용자 정의 Exception 생성할 때 조건
	 * IllegalArgumentException : 매개변수가 잘못 사용되었을 때 발생하는 Exception
	 * 사용자 지정 Exception 정의시 발생시키고자 하는 Exception을 상속받아 사용함
	 * */
	public PasswoedException(String message) {
		super(message);
	}
}
