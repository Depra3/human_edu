package human15;

import java.util.StringTokenizer;

public class StringTokenExam {

	public static void main(String[] args) {
		String text = "홍길동/박연수/이수홍";
		StringTokenizer st = new StringTokenizer(text, "/");
		int cnt = st.countTokens();
		for (int i = 0; i < cnt; i++) {
			String token = st.nextToken();	// 하나씩 뽑아 넣음 (뽑으면 사라짐)
			System.out.println(token);
		}
		
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) { 
			// 다음에 토큰이 존재하면 true
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
