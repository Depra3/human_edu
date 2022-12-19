package human04;

public class Product<T> {
	private T type;
	private String model;
	
	public T getType() {
		return type;
	}
	public void setType(T type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}
