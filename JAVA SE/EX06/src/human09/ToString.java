package human09;

import java.util.Objects;

public class ToString {

	public static void main(String[] args) {
		String str1 = "강현준";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "널입니다."));
		// null인 경우 텍스트 문구 입력
	}

}
