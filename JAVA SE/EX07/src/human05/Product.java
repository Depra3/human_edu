package human05;

public class Product <T>{
	public T type;
	public String model;
	
	public T getT() {
		return this.type;	// 리턴타입 T
	}
	public void setT (T t) {
		this.type = t;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
