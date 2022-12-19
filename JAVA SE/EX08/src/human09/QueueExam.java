package human09;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

	public static void main(String[] args) {
		Coin c1 = new Coin(1);
		Coin c2 = new Coin(5);
		Coin c3 = new Coin(10);
		Coin c4 = new Coin(50);
		Coin c5 = new Coin(100);
		Coin c6 = new Coin(500);
		
		Queue<Coin> que = new LinkedList<Coin>();
		// Queue는 인터페이스. LinkedList에서 구현함.
		
		que.offer(c1);
		que.offer(c2);
		que.offer(c3);
		que.offer(c4);
		que.offer(c5);
		que.offer(c6);
		// c1(1원짜리)은 가장 앞에 있는 동전. 즉 que에서는 가장 빨리 나가는 동전
		// c6(500원짜리)은 가장 뒤에 있는 동전. 즉 que에서는 가장 느게 나가는 동전
		System.out.println(que);
		
		System.out.println(que.peek().value);
		// pekk은 가장 빨리 나갈 수 있는 동전을 확인하는 과정
		
		while (!que.isEmpty()) {
			Coin rmCoin = que.poll();
			// poll은 가장 앞에 있는 동전을 빼낸 후 rmCoin에 빼낸 동전을 대입함.
			System.out.println("rmCoin : " + rmCoin.value);
		}
		System.out.println(que);
		System.out.println("Queue에 아무것도 없습니다.");

	}

}
