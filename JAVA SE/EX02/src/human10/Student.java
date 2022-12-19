package human10;

public class Student {
	public int ID;
	public String name;		//이름
	public int money;		//소지금
	
	public Student(int ID, String name, int money) {
		this.ID = ID;
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus b) {	//버스타기
		if (this.money < 1000) {
			System.out.printf("%s의 소지 금액이 %d이므로 사용불가입니다.\n",this.name,this.money);
		}else {
			this.money = this.money - 1000;
			b.take(1000);
		}
	}
	
	public void takeTrain(Train t) {	//지하철타기
		if (this.money < 1200) {
			System.out.printf("%s의 소지 금액이 %d이므로 사용불가입니다.\n",this.name,this.money);
		}else {
			this.money = this.money - 1200;
			t.take(1200);
		}
	}
	
	public void takeTaxi(Taxi tx) {		//택시타기
		// tx라는 것은 지역번수이고, takeTaxi 메서드 내에서만
		// 사용 가능한 taxi 클래스의 인스턴스 변수이다.
		if (this.money < 10000) {
			System.out.printf("%s의 소지 금액이 %d이므로 사용불가입니다.\n",this.name,this.money);
			//s1.takeTaxi(tx2);에서 s1로 호출하였기에 학생에 대한 인자를 중복해서 받을 필요 없음
		}else {
			this.money = this.money - 10000;
			tx.take(10000);
		}
	}
//	public void st(Student st2, int money) {
//		this.money = this.money + money;
//		st2.money = st2.money - money;		
//	}
	
	public int re(int a) {
		return this.ID;
	}

}
