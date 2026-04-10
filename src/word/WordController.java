package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordController {
	private List<Word> wordBook = new ArrayList<>();
	// 클래스 없이 map으로 생성할 경우
//	private Map<String, List<String>> w = new HashMap<>();
	
	public void addWord() {
		// 기본 단어 5개 추가
		// 단어 : String / 뜻 : List
		String word1 = "dog";
		List<String>tmp = new ArrayList<>();
		tmp.add("개");
		tmp.add("개과 동물");
		tmp.add("강아지");
		
		wordBook.add(new Word(word1, tmp));
		
		String word2 = "cat";
		List<String>tmp2 = new ArrayList<>();
		tmp2.add("고양이");
		tmp2.add("고양이과 동물");

		wordBook.add(new Word(word2, tmp2));
		
		String word3 = "pig";
		List<String>tmp3 = new ArrayList<>(Arrays.asList("돼지", "꿀꿀이"));

		wordBook.add(new Word(word3, tmp3));
	}

	public void insertWord(Scanner scan) {
		// List 먼저 선언
		List<String>tmp = new ArrayList<>();
		System.out.println("단어");
		String word = scan.next();
		
		String end = "a";
		while (!end.toLowerCase().equals("y")) {
			System.out.println("뜻");
			scan.nextLine();
			tmp.add(scan.nextLine());
			System.out.println("계속 입력하시겠습니까 종료(y)");
			end = scan.next();
		}
		wordBook.add(new Word(word, tmp));
		System.out.println("등록완료");
		
	}

	public void searchWord(Scanner scan) {
		// 단어검색
		System.out.println("단어");
		String word = scan.next();
		
		int index = wordBook.indexOf(new Word(word));
		
		if (index == -1) {
			System.out.println("검색단어가 없습니다.");
			return;
					
		}
		System.out.println(wordBook.get(index));
		
	}

	public void modifyWord(Scanner scan) {
		// 단어수정
		System.out.println("단어");
		String word = scan.next();
		
		int index = wordBook.indexOf(new Word(word));
		if (index == -1) {
			System.out.println("검색할 단어가 없습니다.");
			return;
		}
		// word의 단어가 존재한다.
		List<String> mean = wordBook.get(index).getMean();
		int cnt = 0;
		for (String m : mean) {
			cnt++;
			System.out.println(cnt+"."+m);
			
		}
		System.out.println("수정할 뜻의 번호를 선택");
		int i = scan.nextInt();
		System.out.println("변경할 뜻");
		String modifyMean = scan.nextLine();
		
		mean.set(i-1,  modifyMean);
		wordBook.set(index, new Word(word, mean));
		System.out.println("수정완료");
	}

	public void printWord() {
		// 전체단어출력
		System.out.println("단어장");
		wordBook.sort(null);
		
		// class에서 구형한 Comparable이 작동하여 정렬
		Collections.sort(wordBook);
		
//		list.sort() : Comparable 구현해놓은 구현체는 불가능
		
		for(Word w : wordBook) {
			System.out.println(w);
		}
		System.out.println("----------");
		
	}

	public void removeWord(Scanner scan) {
		// 단어 삭제
		System.out.println("단어");
		String word = scan.next();
		
		if (wordBook.remove(new Word(word))) {
			System.out.println("삭제완료");
			return;
		}
		System.out.println("삭제단어가 없습니다.");
		
	}
	
	public void output() throws IOException {
		// 파일로 출력
		// StringBuffer 객체 사용 => 추가 기능 append()
		// String 객체의 확장버전
		// StringBuffer 객체를 => String으로 변환하여 저장

		System.out.println("파일로 출력합니다.");
		final String fileName = "D:\\java_260403_ljw\\memo\\word.txt";
		
		BufferedWriter bw = 
				new BufferedWriter(new FileWriter(fileName));
		
		StringBuffer sb = new StringBuffer();
		// \n : 줄바꿈.
		sb.append("--단어장--\r\n");
		int cnt = 0;
		for (Word w : wordBook) {
			cnt++;
			sb.append(cnt);
			sb.append(", ");
			sb.append(w); // toString 모양대로 출력
			sb.append("\r\n");
		}
		bw.write(sb.toString()); // StringBuffer객체를 String객체로 변경

		
		bw.close();
	}
	
	
}
