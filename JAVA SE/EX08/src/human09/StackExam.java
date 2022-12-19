package human09;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		Coin c1 = new Coin(1);
		Coin c2 = new Coin(5);
		Coin c3 = new Coin(10);
		Coin c4 = new Coin(50);
		Coin c5 = new Coin(100);
		Coin c6 = new Coin(500);
		
		Stack<Coin> st = new Stack<Coin>();
		// stack이란 클래스는 LIFO를 지원한다.
		// LIFO : Last Input First Output
		
		st.push(c1);
		st.push(c2);
		st.push(c3);
		st.push(c4);
		st.push(c5);
		st.push(c6);
//		System.out.println(st);
		// c1(1원짜리) 이 것이 가장 밑에 있음.
		// c6(500원짜리) 이 것이 가장 위에 있음.
		
		System.out.println(st.peek().value);
		// st.peek() ==> c6 객체를 표현함.
		// st.peek().value ==> c6.value ==> c6이 가지고 있는 value
		// peek은 가장 위에 있는 것을 확인함.
		
		while (!st.empty()) {
			// st.empty()는 비어있는가?
			// !는 NOT의 의미이므로 !st.empty()는 비어있지 않는가?
			Coin rmCoin = st.pop();
			// st.pop()은 가장 위의 것을 꺼내고 stack에서 삭제
			// rmCoin 객체는 꺼내진 것을 의미함.
			System.out.println("제거된 코인 : " + rmCoin.value);
		}
		System.out.println(st);
		System.out.println("Stack에 코인이 없습니다.");
	}

}