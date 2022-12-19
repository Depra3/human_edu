package J221121;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<String> alName;	// 메뉴명 목록
	ArrayList<Integer> alPrice;	// 메뉴가격 목록
	
	Menu(){
		// alName, alPrice 초기화
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		// d:\temp\menu.txt를 찾고 열어서 메뉴명/가격을 읽어들인다.
		File file = new File("d:\\temp\\menu.txt");
		try(Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] token = line.split(","); // ["Americano","2500"]
				this.alName.add(token[0]);
				this.alPrice.add(Integer.parseInt(token[1]));
//				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void save() {
		// alName, alPrice의 메뉴명, 가격을 menu.txt에 쓰기(저장)
		try {
			File file = new File("d:\\temp\\menu.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			PrintWriter writer = new PrintWriter(fw);
			
			for (int i = 0; i < this.alName.size(); i++) {
				writer.write(this.alName.get(i)+","+this.alPrice.get(i)+"\n");
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void add(String name, int price) {
		// alName, alPrice에 name, price 추가
		this.alName.add(name);
		this.alPrice.add(price);
	}
	private void delete(int index) {
		// alName, alPrice 양쪽에서 index번호를 가진 것을 제거
		if (this.alName.isEmpty()) {
			System.out.println("---------------------------------------");
			System.out.println("목록 없음");
			System.out.println("---------------------------------------");
			return;
		}else {
			index = index - 1;
			this.alName.remove(index);
			this.alPrice.remove(index);
		}
	}
	private void update(int index, String name, int price) {
		// alName, alPrice 양쪽에서 index번호의 이름과 가격을 수정
		if (this.alName.isEmpty()) {
			System.out.println("---------------------------------------");
			System.out.println("목록 없음");
			System.out.println("---------------------------------------");
			return;
		}else {
			index = index - 1;
			this.alName.set(index, name);
			this.alPrice.set(index, price);
		}
	}
	void display() {
		//메뉴명과 가격을 표시
		/*
		 * Americano, 2500
		 * Mocca, 3200
		 * Espresso, 2700
		 * Cappuccino, 3500
		 * Latte, 3000
		 */
		if (this.alName.isEmpty()) {
			System.out.println("---------------------------------------");
			System.out.println("목록 없음");
			System.out.println("---------------------------------------");
			return;
		}else {
			System.out.println("---------------------------------------");
			for (int i = 0; i < this.alName.size(); i++) {
				String name = this.alName.get(i);
				int price = this.alPrice.get(i);
				System.out.println((i+1)+ " - 메뉴명 : " + name + ", 가격 : " + price);
			}
			System.out.println("---------------------------------------");
		}
	}
	private boolean check() {
		if (this.alName.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	void control() {
		Scanner s1 = new Scanner(System.in); // 문자열 입력 전용
		Scanner s2 = new Scanner(System.in); // 숫자 입력 전용
		
		while (true) {
			System.out.print("메뉴 작업을 선택하시오. [c : 추가, r : 목록 표시, u : 수정, d : 삭제, '' : 프로그램 종료] : ");
			String instr = s1.nextLine();
			if(instr.equals("")) {	//""
				// while exit, program terminated.
				this.save();
				break;
			}else
			if (instr.equals("c")) {	// "c" 추가
				// 메뉴명, 가격 입력 받고, menu.add()
				String name;
				int price;
				
				System.out.print("메뉴 명 : ");
				name = s1.nextLine();
				
				System.out.print("해당 메뉴 가격 : ");
				price = s2.nextInt();
				
				this.add(name, price);
				
			} else if(instr.equals("r")) {	// "r" 목록 표시
				this.display();
			} else if(instr.equals("u")) {	// "u" 수정
				// 수정할 메뉴의 인덱스번호 입력받고
				// 새 이름, 가격 입력
				// menu.update()
				
				String name;
				int price, index;
				boolean list_Check;
				
				list_Check = this.check();
				if (list_Check) {
					this.display();
					System.out.print("수정할 메뉴 번호 : ");
					index = s2.nextInt();
					
					System.out.print("새 메뉴 명 : ");
					name = s1.nextLine();
					
					System.out.print("새 해당 메뉴 가격 : ");
					price = s2.nextInt();
					
					this.update(index, name, price);
				} else {
					this.display();
				}
				
			} else if (instr.equals("d")) { // "d" 삭제
				// 삭제할 메뉴의 인덱스 번호 입력 받기
				// menu.delete()
				this.display();
				int index;
				System.out.print("삭제할 메뉴 번호 : ");
				index = s2.nextInt();
				
				this.delete(index);
			}
		}
	}
}
