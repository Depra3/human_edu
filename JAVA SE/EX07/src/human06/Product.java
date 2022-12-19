package human06;

public class Product <T, M>{// 파라미터 타입 추가
	public T type;
	public M model;
	
	public T getT() {		// 리턴타입 T
		return this.type;
	}
	public void setT (T t) {
		this.type = t;
	}
	
	public M getModel() {	// 리턴타입 M
		return this.model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
