package day07;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray3 {

	public static void main(String[] args) {
		// 성적표
		/* 성적산출인원 > 3(입력)
		 * 이름	국어	영어	수학	합계	평균	등수 \t
		 * hoog	89	85	78	00	00	00
		 * kim	89	85	78	00	00	00
		 * lee	89	85	78	00	00	00
		 * 
		 * 이름, 국어, 영어, 수학을 입력받아 합계, 평균, 등수
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적산출인원>");
		
		int num = scan.nextInt();
		
		
		String name[] = new String [num];
		int kor [] = new int [num];
		int eng [] = new int [num];
		int math [] = new int [num];
		int sum [] = new int [num];
		double avg [] = new double [num];
		int rank [] = new int [num];
		
		for (int i=0; i<name.length; i++) {
			name[i] = scan.next();
					
		}
		
		
		for (int i=0; i<kor.length; i++) {
			kor[i] = (int)(Math.random()*100) + 1;
			eng[i] = (int)(Math.random()*100) + 1;
			math[i] = (int)(Math.random()*100) + 1;
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = sum[i] / 3.0;
		}
		
		for (int i=0; i<avg.length; i++) {
			int r = 1;
			for (int j=0; j<avg.length; j++) {
				if (avg[i] < avg[j]) {
					r++;
				}
			}rank[i] = r;
		}
		
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 합계 \t 평균 \t 등수");
		
		for (int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(kor[i] + "\t");
			System.out.print(eng[i] + "\t");
			System.out.print(math[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();
		}
		scan.close();
	}
}
