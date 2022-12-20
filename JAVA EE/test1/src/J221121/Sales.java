package J221121;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Sales {
	ArrayList<String> alMobile;
	ArrayList<String> alMenu;
	ArrayList<Integer> alQty;
	ArrayList<Integer> alPrice;
	ArrayList<String> alTime;
	Order order;
	public Sales() { // 초기화
		this.alMenu = new ArrayList<>();		// 메뉴 이름
		this.alMobile = new ArrayList<>();	// 모바일 번호
		this.alQty = new ArrayList<>();		// 주문 수량
		this.alPrice = new ArrayList<>();	// 합계 액수
		this.alTime = new ArrayList<>();		// 주문 시각
	}
	// Sales 객체에 Order 객체의 내용을 복사
	// alMobile = this.mobile
	// alMenu = this.alName
	// alQty = this.alQty
	// alPrice = this.alPrice
	// alTime = new Date();
	void add(Order o) {
//		this.order = o;
		for (int i = 0; i < o.getSize(); i++) {
			this.alMenu.add(o.getAlName().get(i));
			this.alPrice.add(o.getAlPrice().get(i));
			this.alQty.add(o.getAlQty().get(i));
			this.alMobile.add(o.getMobile());
			
			DateFormat dF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			String dateStr = dF.format(date);
			this.alTime.add(dateStr);
		}
	}
	void display() {
		int sum = 0;
		String mobile = null;
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < this.alMenu.size(); i++) {
			String name = this.alMenu.get(i);
			mobile = this.alMobile.get(i);
			int cnt = this.alQty.get(i);
			int price = this.alPrice.get(i);
			
			sum = sum + price;
			System.out.println((i+1)+ " - 메뉴명 : " + name + ", 수량 : " + cnt 
					+ "개, 합계 : " + price + "원" + ", 전화 번호 : " + mobile
					+ ", 주문 시각 : " + this.alTime.get(i));
		}
		System.out.println("총 합계 액수 : " + sum);
		System.out.println("------------------------------------------------------------");
	}
	void save() {
		try {
			DateFormat dF = new SimpleDateFormat("yyyyMMdd");
			Date date = new Date();
			String dateStr = dF.format(date);
			File file = new File("d:\\temp\\"+dateStr+"sales.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			PrintWriter writer = new PrintWriter(fw);
			
			for (int i = 0; i < this.alMenu.size(); i++) {
				writer.write(this.alMobile.get(i)+","+this.alMenu.get(i)+","+this.alQty.get(i)+","+this.alPrice.get(i)+"\n");
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
