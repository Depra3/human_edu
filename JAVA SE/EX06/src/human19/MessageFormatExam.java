package human19;

import java.text.MessageFormat;

public class MessageFormatExam {
	public static void main(String[] args) {
		String id = "Human";
		String name = "강현준";
		String tel = "010-123-1234";
		
		
//		System.out.println(MessageFormat.format("회원 ID : {0} \n회원 이름 : {1} \n전화 번호 : {2}\n", id, name, tel));
		
//		String text = MessageFormat.format("회원 ID : {0} \n회원 이름 : {1} \n전화 번호 : {2}\n", id, name, tel);
//		System.out.println(text);
		
		String tempText = "회원 ID : {0} \n회원 이름 : {1} \n전화 번호 : {2}\n";
		String text = MessageFormat.format(tempText, id, name, tel);
		System.out.println(text);
	}
}
