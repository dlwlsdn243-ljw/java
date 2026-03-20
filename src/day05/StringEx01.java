package day05;

public class StringEx01 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일과 나이 성별을 출력
		String regNum = "990101-1234567"; // 1900년대 => 1 (남) 2(여)
//		String regNum = "000101-4234567"; // 2000년대 => 3 (남) 4(여)
		int today = 2026;
		
		/* 출력결과
		 * 생년월일 : 990101
		 * 성별 : 남
		 * 나이 : 27
		 * */
		// 내가한거
//		String str = regNum.substring(0, regNum.indexOf("-"));
//		System.out.println("생년월일 : " + str);
//		
//		switch (regNum.charAt(7)) {
//		case '1' :
//			System.out.println("성별 : " + "남");
//			break;
//		case '2' :
//			System.out.println("성별 : " + "여");
//			break;
//		case '3' :
//			System.out.println("성별 : " + "남");
//			break;
//		case '4' :
//			System.out.println("성별 : " + "여");
//			break;
//		}	
//		
//		regNum.substring(0,2);
//		int num1 = Integer.parseInt(regNum.substring(0,2));
//		int num2 = num1 + 1900;
//		int num3 = today - num2;
//		
//		if (regNum.charAt(7) == 1) {
//			num3 = today - num2;	
//		} else if (regNum.charAt(7) == 2) {
//			num3 = today - num2;
//		} else if (regNum.charAt(7) == 3) {
//			num3 = today - num2;
//		} else if (regNum.charAt(7) == 4) {
//			num3 = today - num2;
//		}
//		System.out.println("나이 : " + num3);

		String birth = regNum.substring(0, regNum.indexOf("-"));
		System.out.println("생년월일 : " + birth);
		
		char rNum = regNum.charAt(7);
//		System.out.println(rNum);
		
		String gender = (rNum == '1' || rNum == '3') ? "남" : "여";
		System.out.println("성별 : " + gender);
		
		String year = (regNum.substring(0,2));
		if (rNum == '1' || rNum == '2') {
			year = "19".concat(year); // 문자열 연결 1999 => "19" + year
		} else {
			year = "20".concat(year);
		}
		System.out.println(year);
		
		int age = today - Integer.parseInt(year);
		
		System.out.println("나이 : " + age);
		
		System.out.println("-----------------------------");
		System.out.println("숫자로 미리 변환");
		
		int year2 = Integer.parseInt(regNum.substring(0,2));
		if (rNum == '1' || rNum == '2') {
			year2 = year2 +1900;
		} else {
			year2 = year2 +2000;;
		}
		System.out.println("나이 : " + (today - year2));
	}

}
