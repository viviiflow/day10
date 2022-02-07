package day10;

import java.util.StringTokenizer;

public class TypeConversion {
	public static void main(String[] args) {
		// p1
		System.out.println("<p1>");
		char ch = 'a';
		int aNum = (int) ch;
		System.out.println(aNum);

		ch = (char) (aNum + 2);
		System.out.println(ch);

		String strnum = "10";
		int num = Integer.parseInt(strnum);
		System.out.println(num);

		// p8
		System.out.println();
		System.out.println("<p8>");
		String query = "name=kitae&addr=seoul&age=21";
		String ring = "java.day.eclipse";
		StringTokenizer st = new StringTokenizer(query, "=");
		StringTokenizer st2 = new StringTokenizer(ring, ".");
		int n = st.countTokens();
		System.out.println(n);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		while (st2.hasMoreTokens()) {
			String token2 = st2.nextToken();
			System.out.println(token2);
		}
		System.out.println();

		// p9
		System.out.println("<p9>");
		String id = "040705-4444444";
		System.out.println("1) 나이 출력");
		String str = id.substring(0, 2);
		int age = Integer.parseInt(str);
		char gender = id.charAt(7);
		int gen = gender;
		System.out.println((2022 - (2000 + age)) + "살");
		if(gen%2==0) {
			System.out.println("여자");
		}else {
			System.out.println("남자");
		}

	}
}
