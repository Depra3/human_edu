package human09;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");	// ==> public Parent(String nation)
		System.out.println("Parent call");
	}
	
	public Parent(String nation) {
		this.nation =nation;
		System.out.println("Parent(String nation) call");
	}

}
