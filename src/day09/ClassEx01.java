package day09;

import java.util.Arrays;

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t = new TV("LG");
		t.power(); 
		t.chUp(); 
		t.chUp(); 
		t.chDown(); 

		t.volUp();
		t.volUp();
		t.volUp();
		t.chUp();
		t.pick();
		t.chUp();
		t.pick();
		t.chUp();
		t.pick();
		t.chUp();
		t.pick();
		t.chUp();
		t.pick();
		t.chUp();
		t.pick();
		t.volUp();
		t.chDown();
		t.chDown();
		t.pick();
		t.chDown();
		t.chUp();
		t.pick();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.favorList();
		
	}

}

class TV{
	// 맴버변수 : brand, power, ch, vol
	private String brand;
	private boolean power;
	private int ch;
	private int vol;
	private int[] favor = new int[5];
	private int index = 0; // 배열의 번지 역할
	
	
	// 생성자
	// 기본생성자
	public TV() {
		ch = 3; // 기본 초기값
		vol = 3; // 기본 초기값
	}
	// 매개변수 생성자 brand만 받기
	public TV(String brand) {
		this(); // 기본생성자 호출 / 첫줄에서만 가능
		this.brand = brand;
	}

	// 메서드
	
	// pick() : 선호채널로 등록
	public void pick() {
		// index 번지에 현재채널을 넣는다.
		boolean check = false;
		if (this.power) {
			if (favor.length == index) {
				index = 0;
			}
			for(int i=0; i<favor.length; i++) {
				if (favor[i] == ch) {
					check = true;
				}
			}
			if (!check) {
				favor[index] = ch;
				index++;
			}
			System.out.println(ch + "번 선호채널 등록");
		}
	}
	
	// favorList() : 선호채널 출력
	public void favorList() {
		// 배열을 리스트 형태로 출력
		System.out.println("선호채널 목록");
		if (favor[0]==0) {
			System.out.println("선호채널이 등록되지 않았습니다.");
			return;
		}
		for(int i=0; i<favor.length; i++) {
			System.out.print(i+1+". ");
			if(favor[i] == 0) {
				System.out.println("♊");
			}else {
				System.out.println(favor[i]);
			}
		}
	}
	
	// 1. power on/off
	public void power() {
		this.power = !this.power;
		if(this.power) {
			System.out.println("전원이 켜집니다.");
		} else {
			System.out.println("전원이 꺼집니다.");
		}
		 
	}

	// 2. chUp(1~10까지 순환구조)
	public void chUp() {
			if (this.power) {
				ch++;
				if (this.ch > 10) {
					this.ch = 1;
				}
				System.out.println("ch : " + ch);
			}
		}  
	
	//3. chDown(1~10까지 순환구조)
	public void chDown() {
		if (this.power) {
			ch--;
			if (this.ch < 1) {
				this.ch = 10;
			}
			System.out.println("ch : " + ch);
	} 
}
	// 4. volUp(0~20)
	public void volUp() {
		if (this.power) {
			vol++;
			if (this.vol >= 20) {
				this.vol = 20;
			}
			System.out.println("vol : " + vol);
		} 
	}
	
	// 5. volDown(0~20)
	public void volDown() {
		if (this.power) {
			vol--;
			if (this.vol <= 0) {
				System.out.println("음소거");
				this.vol = 0;
				System.out.println("vol : " + vol);
				return;
			}
		} 
	}
	
	/* 선호채널 등록
	 * 5개까지 등록가능
	 * 1. 선호채널 등록메서드
	 * 	- 현재 채널을 선호채널 배열에 넣기
	 * 2. 선호채널 리스트 보기
	 * 	- 등록된 선호채널을 리스트로 출력
	 * */
//	public void favor() {
//		if (this.power) {
//			this.favor[index] = this.ch;
//			index++;
//			System.out.println(this.ch + "채널 등록되었습니다.");
//		} System.out.println(Arrays.toString(this.favor));
//	}
	

	// toString
	@Override
	public String toString() {
		return "TV [brand=" + brand + ", power=" + power + ", ch=" + ch + ", vol=" + vol + "]";
	}
	// getter/setter
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public int[] getFavor() {
		return favor;
	}
	public void setFavor(int[] favor) {
		this.favor = favor;
	}


}