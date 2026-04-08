package day18;

public class File01 {

	public static void main(String[] args) {
		// File : java.io.* => try / catch 필수
		/* java는 입력스트림, 출력스트림을 통해 데이터를 입출력 함.
		 * inputStream / outputStream (IOStream) : 단방향으로 흘러가는 형태
		 * 다양한 장치에 독립적으로 운영, 일관성있게 입출력을 유지하기 위해 사용
		 * 
		 * - 데이터의 형태 : 문자 / 바이트
		 * - 바이트 : 그림, 영상, 실행파일, 소리...
		 * - 문자 : 문자를 입출력할 때 사용
		 * 
		 * 바이트 스트림
		 * - 입력 : FileInputStream, BufferedInputStream...
		 * - 출력 : FileOutputStream, BufferedOutputStream...
		 * 
		 * 문자 스트림 : encoding  처리를 해줌
		 * - 입력 : FileReader, BufferedReader, InputStreamReader...
		 * - 출력 : FileWroter, BufferedWroter, printWroter
		 * 
		 * 기반 스트림 / 보조 스트림
		 * 기반 스트림 : 직접 읽고 쓰는 기능을 하는 스트림
		 * - FileInputStream, FileOutputStream, FileReader, FileWroter
		 * 보조 스트림 ; 읽고 쓰는 기능은 없고, 추가적인 기능을 더해주기 위한 스트림
		 * - Buffered~ 
		 * */
		
		// 표준 출력(모니터 = 콘솔) 스트림
		System.out.println("print");
		
		// 표준출력 error 출력 스트림
		System.err.println("Error");
		
		// 표준입력(키보드) 스트림
		try {
			// 바이트 단위 스트림
			int input = System.in.read();// 아스크 코드값(유니코드)
			System.out.println((char)input);
			System.out.println(input);
			
		} catch (Exception e) {

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
