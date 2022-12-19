package human07;

public class HumanExam01 {

	public static void main(String[] args) {
		String human1;			//String 참조형
		human1 = "휴먼교육센터";
		//human1에는 stack영역에서는 heap영역의 시작 번지를 참조함.
		String human2 = "휴먼교육센터";					//없으면 만들고, 있으면 같은 시작 번지에서 참조.
		String human3 = new String("휴먼교육센터");		//new : 새로이 만들라는 것, 새로운 객체 생성
		String human4 = new String("휴먼교육센터");
		
		boolean x1 = (human1 == human2);	//true, false
		boolean x2 = (human1 == human3);
		boolean x3 = (human3 == human4);
		
		System.out.printf("(human1 == human2) ==> %b \n", x1);	//시작번지가 같음
		System.out.printf("(human1 == human3) ==> %b \n", x2);	//new로 인해 시작 번지가 다름
		System.out.printf("(human3 == human4) ==> %b \n", x3);	//new로 인해 시작 번지가 다름
		
		boolean y1 = human1.equals(human3);		//~.equals(~) :  변수 내의 텍스트 비교
		System.out.printf("human1.equals(human3) ==> %b \n", y1);
		System.out.printf("human3.equals(human4) ==> %b \n", human3.equals(human4));
		
	}
	
}