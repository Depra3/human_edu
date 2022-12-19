package human07_1;

public class Student {
	public int id;
	public String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int hashCode() {
		return this.id + this.name.hashCode();
	}
	
	public boolean equals(Object obj) {
		// Object obj = new Student(1, "강현준");
		// 자동타입변환.
		if (obj instanceof Student) {	// 강제타입변환
			Student st = (Student) obj;
			if (this.name.equals(st.name) && (this.id == st.id)) {
				return true;
			}
		}
		return false;
	}
}
