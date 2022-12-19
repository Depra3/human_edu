package human15;

public class StringGetBytesExam {
	public static void main(String[] args) {
		String str = "안녕하세요";
		// 영문일때는 1byte
		// 한글일때는 우리는 UTF-8 인코딩 기반으로 3byte로 처리됨.

		byte[] b1 = str.getBytes(); // UTF-8
		System.out.println("b1.length : " + b1.length);
		String str1 = new String(b1);
		System.out.println("byte ==> String : " + str1);

		try {
			byte[] b2 = str.getBytes("EUC-KR");
			// EUC-KR 이란 인코딩 타입으로 바이트 값을 얻어온다.
			// EUC-KR은 한글의 경우 한글자가 2byte로 처리됨.
			System.out.println("b2.length : " + b2.length);
			String str2 = new String(b2, "EUC-KR");
			// 뒤의 "EUC-KR"가 없을 경우 기존에 사용하고 있는 UTF-8로 인코딩함
			System.out.println("byte ==> String : " + str2);

			byte[] b3 = str.getBytes("UTF-8");
			System.out.println("b3.length : " + b3.length);
			String str3 = new String(b3, "UTF-8");
			System.out.println("byte ==> String : " + str3);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
