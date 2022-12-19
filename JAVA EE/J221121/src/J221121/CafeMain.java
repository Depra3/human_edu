package J221121;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Sales sales = new Sales();
		
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("작업 선택 [ m : 메뉴 작업, o : 주문 관리, s : 매출 조회, '' : 종료 ] : ");
			String op = sc.nextLine();
			if (op.equals("m")) {
				menu.control();
			} else if (op.equals("o")) {
				Order order = new Order(menu); // 초기화 & 리셋
				order.control();
				sales.add(order);
			} else if (op.equals("s")) {
				sales.display();
			} else if (op.equals("")) {
				sales.save();
				break;
			}
		}
		System.out.println("----------------------");
		System.out.println("프로그램 종료");
		sc.close();
		
		
		
//		Scanner s1 = new Scanner(System.in); // 문자열 입력 전용
//		Scanner s2 = new Scanner(System.in); // 숫자 입력 전용
//		
//		while (true) {
//			System.out.print("메뉴 작업을 선택하시오. [c : 추가, r : 목록 표시, u : 수정, d : 삭제, '' : 프로그램 종료] : ");
//			String instr = s1.nextLine();
//			if(instr.equals("")) {	//""
//				// while exit, program terminated.
//				break;
//			}
//			if (instr.equals("c")) {	// "c"
//				// 메뉴명, 가격 입력 받고, menu.add()
//				String name;
//				int price;
//				
//				System.out.print("메뉴 명 : ");
//				name = s1.nextLine();
//				
//				System.out.print("해당 메뉴 가격 : ");
//				price = s2.nextInt();
//				
//				menu.add(name, price);
//				
//			} else if(instr.equals("r")) {	// "r"
//				menu.display();
//			} else if(instr.equals("u")) {	// "u"
//				// 수정할 메뉴의 인덱스번호 입력받고
//				// 새 이름, 가격 입력
//				// menu.update()
//				String name;
//				int price, index;
//				boolean list_Check;
//				
//				list_Check = menu.check();
//				if (list_Check) {
//					System.out.print("수정할 메뉴 번호 : ");
//					index = s2.nextInt();
//					
//					System.out.print("새 메뉴 명 : ");
//					name = s1.nextLine();
//					
//					System.out.print("새 해당 메뉴 가격 : ");
//					price = s2.nextInt();
//					
//					menu.update(index, name, price);
//				} else {
//					menu.display();
//				}
//				
//			} else if (instr.equals("d")) {
//				// 삭제할 메뉴의 인덱스 번호 입력 받기
//				// menu.delete()
//				int index;
//				System.out.print("삭제할 메뉴 번호 : ");
//				index = s2.nextInt();
//				
//				menu.delete(index);
//			}
//		}
//		System.out.println("---------------------------------------");
//		System.out.println("프로그램 종료");
//		s1.close();
//		s2.close();
	}
}
