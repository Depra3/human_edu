package human04_1;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int[] score;

	public Member(String id, String name, String password, int age, boolean adult, int[] score) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.score = score;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 복제 기능
		// cloned ==> 복제된 Member를 담아준다.
		return cloned; // 객체 반환
	}
}
