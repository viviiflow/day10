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
		String[] items = { "���", "�ٳ���", "����" };

		int log = -1;
		int chkid = 100, chkpw = 101;

		while (true) {
			System.out.println("<�α���>");
			System.out.println("���̵� �Է�:");
			String id = sc.next();
			System.out.println("�н����� �Է�:");
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
					System.out.println("<�޴�>");
					System.out.println("1) ���");
					System.out.println("2) �ٳ���");
					System.out.println("3) ����");
					System.out.println("�޴� ����:");
					int slt = sc.nextInt();
					if (slt - 1 > 2) {
						System.out.println("�޴��� �ٽ� �������ּ���.");
						continue;
					} else {
						jang[cnt][0] = chkid;
						jang[cnt][1] = slt - 1;
						for (int k = 0; k <= cnt; k++) {
							System.out.println(ids[jang[k][0]] + "ȸ��          > " + items[jang[k][1]] + "����");
						}
						cnt++;
						log = -1;
						break;
					}
				}
			} else {
				System.out.println("���̵� Ȥ�� �н����尡 Ʋ���ϴ�.");
				continue;
			}
		}
	}
}
