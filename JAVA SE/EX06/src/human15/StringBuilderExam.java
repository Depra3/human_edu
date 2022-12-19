package human15;

public class StringBuilderExam {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("JAVA ");	// 문자열 추가
		sb.append("Program Study");
		System.out.println(sb.toString());

		sb.insert(4, "2"); // 4번째 위치에 "2"를 추가 // 한글자 이상
		System.out.println(sb.toString());

		sb.setCharAt(4, '6'); // 4번째 위치에 "6"으로 바꿈. // 한글자
		System.out.println(sb.toString());

		sb.replace(6, 13, "BOOK"); // 6~13번째 위치를 BOOK으로 교체
		System.out.println(sb.toString());

		sb.delete(4, 5); // 4~5 내용 삭제. 주의 : 5는 미포함.
		System.out.println(sb.toString());

		int leng = sb.length();
		System.out.println("총 문자수 : " + leng);

		String str = sb.toString();
		String str2 = str + " / human computer";
		System.out.println(str2);
	}
}
