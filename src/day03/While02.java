package day03;

public class While02 {

	public static void main(String[] args) {
		// 1~10까지의 합계를 while 문으로 출력
		
		int count = 1;
		int sum = 0;
		while(true) {
			sum = sum + count;
			count++;
			if (count > 10) {
				break; 
			}
		}
		System.out.println(sum);
		
		System.out.println("------------------------------------------");
		
		int count1 = 1;
		int sum1 = 0;
		while (count1 <= 10) {
			sum += count1;
			count1++;
		}
		
		
		// 1~10까지의 짝수 합계 while 문으로 출력
		count = 1;
		sum = 0;
		while(true) {
			if (count % 2 == 0) {
				sum = sum + count;
				count++;

			}
			if (count > 10) {
				break; 
			}
		}
		System.out.println(sum);
		
		count1 = 0;
		sum1 = 0;
		while (count1 <= 10) {
			if (count1 % 2 == 0) {
				sum += 1;
			}
			count1++;
		}	
		
	}

}
