package day10;

import java.util.Scanner;

public class shopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };

		int max = 100;
		int[][] jang = new int[max][2];
		int cnt = 0;
		String[] items = { "사과", "바나나", "딸기" };

		int log = -1;
		int chkid = 100, chkpw = 101;

		while (true) {
			System.out.println("<로그인>");
			System.out.println("아이디 입력:");
			String id = sc.next();
			System.out.println("패스워드 입력:");
			String pw = sc.next();

			for (int i = 0; i < 3; i++) {
				if (ids[i].equals(id)) {
					chkid = i;
				}
			}
			for (int j = 0; j < 3; j++) {
				if (pws[j].equals(pw)) {
					chkpw = j;
				}
			}
			if (chkid == chkpw) {
				log = 1;
				while (true) {
					System.out.println("<메뉴>");
					System.out.println("1) 사과");
					System.out.println("2) 바나나");
					System.out.println("3) 딸기");
					System.out.println("메뉴 선택:");
					int slt = sc.nextInt();
					if (slt - 1 > 2) {
						System.out.println("메뉴를 다시 선택해주세요.");
						continue;
					} else {
						jang[cnt][0] = chkid;
						jang[cnt][1] = slt - 1;
						for (int k = 0; k <= cnt; k++) {
							System.out.println(ids[jang[k][0]] + "회원          > " + items[jang[k][1]] + "구매");
						}
						cnt++;
						log = -1;
						break;
					}
				}
			} else {
				System.out.println("아이디 혹은 패스워드가 틀립니다.");
				continue;
			}
		}
	}
}
