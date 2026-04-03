package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		// 숫자를 입력받아 리스트로 생성
		// 출력 => 전체 합계 출력
		// 45,78,59,68,59,63,67,62,62 enter

		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력(,로 구분)");
		
		String str = scan.next();
		
		String[] num = str.split(",");
		int sum = 0;
		List<Integer>list = new ArrayList<Integer>();
		
		for (String n : num) {
			int number = Integer.parseInt(n);
			list.add(number);
			sum += number;
		}
		System.out.println(list);
		System.out.println(sum);
		
		scan.close();
		
		

	}

}
