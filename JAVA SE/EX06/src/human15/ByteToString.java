package human15;

public class ByteToString {
	public static void main(String[] args) {
		byte[] b = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str1 = new String(b);
		// 아스키코드 수치를 문자로 변환하여 문자열 생성
		System.out.println(str1);
		
		String str2 = new String(b,6,4);
		// 배열 6자리에서부터 4개 선택하여 문자열 생성.
		System.out.println(str2);
	}
}
