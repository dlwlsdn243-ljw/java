package day06;

public class StringEx02 {

	public static void main(String[] args) {
		// fileNave.suffix
		/* 파일명 / 확장자를 분리하여 출력
		 * 확장자가 java면 "자바파일입니다. / 기타파일입니다."
		 * */
		
		String file = "자바의 정석.java";
		
		String fileName = file.substring(0,file.indexOf("."));
		System.out.println(fileName);
		
		String suffix = file.substring(file.indexOf(".") + 1);
		System.out.println(suffix);
		
		if (suffix.equals("java")) {
			System.out.println("자바파일입니다");
		} else {
			System.out.println("기타파일입니다");
		}
		
		System.out.println("-------------------------------------------");
		
		//split => 특정 값을 기준으로 분리하여 배열로 리턴
		String[] fileArr = file.split("\\.");
		for (String f : fileArr) {
			System.out.println(f);
		} if (fileArr.equals("java")) {
			System.out.println("자바파일입니다");
		} else {
			System.out.println("기타파일입니다");
		}

	}

}
