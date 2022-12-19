package humanExam;

public class ColorPointExam {

	public static void main(String[] args) {
		ColoPoint cp = new ColoPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}

}
