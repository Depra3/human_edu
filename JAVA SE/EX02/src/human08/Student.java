package human08;

public class Student {
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;

//	public Student() {
//		
//	}
	public Student(String name, int ban, int no, 
			int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		int sum;
		sum = this.kor + this.eng + this.math;
		return sum;
		// return this.kor + this.eng+this.math;
	}

	public double getAVG() {
		double avg;
		avg = this.getTotal() / 3.;	//3. 으로 double변환
		return avg;
		//return this.getTotal() / 3.;
	}
}
