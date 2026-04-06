package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordController {
	
	// map을 사용하여 단어를 저장
	private Map<String, String> map = new HashMap<>();
	

	public void addWord() {
		// 기본 단어 5개 추가
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("kiwi", "키위");
		map.put("dog", "개");
		map.put("cat", "고양이");
	}
	
	public void printWord() {
		// 단어 출력
		System.out.println("--단어장--");
		int cnt=0;
		for(String s : map.keySet()) {
			cnt++;
			System.out.println(cnt+". "+s+":"+map.get(s));
		}
		System.out.println("--------------");
	}

	public void insertWord(Scanner scan) {
		// 단어등록
		System.out.println("단어>");
		String word = scan.next();  // 띄어쓰기 없이 단어만 입력
		System.out.println("뜻>");
		// 앞에서 단어에서 입력한 Enter 가 scan의 입력버퍼 남아있음. 
		scan.nextLine();  // 입력버퍼 비우기
		String mean = scan.nextLine(); // 공백 처리가 가능한 입력
		
		map.put(word, mean);
		System.out.println("단어추가완료!!");
	}

	public void searchWord(Scanner scan) {
		// 단어검색
		System.out.println("단어>");
		String word = scan.next();  // 띄어쓰기 없이 단어만 입력
		// 입력받은 단어가 map 에 있는지 확인
		// containsKey : key가 map에 존재하는지 확인 true / false
		if(map.containsKey(word)) {
			System.out.println("--검색결과--");
			System.out.println(word+":"+map.get(word));
			return;
		}
		System.out.println("검색결과가 없습니다.");
		
	}

	public void modifyWord(Scanner scan) {
		// 단어수정 : set 이 없음.
		// 수정 => 기존에 값을 삭제하고, 다시 추가
		System.out.println("단어>");
		String word = scan.next();
		
		// remove(key) => value 리턴 (없으면 null)
		if(map.remove(word) == null) {  // 이미 여기서 단어 삭제
			System.out.println("수정할 단어가 없습니다.");
			return;
		}
		scan.nextLine(); //입력 버퍼 지우기
		
		System.out.println("뜻>");
		String mean = scan.nextLine();
		map.put(word, mean);
		System.out.println("수정완료!!");
		
	}

	public void removeWord(Scanner scan) {
		// 단어삭제
		System.out.println("단어>");
		String word = scan.next();
		
		// remove(key) => value 리턴 (없으면 null)
		if(map.remove(word) == null) {  // 이미 여기서 단어 삭제
			System.out.println("삭제할 단어가 없습니다.");
			return;
		}
		System.out.println("삭제완료");
	}

}