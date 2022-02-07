package day10;

public class delete {
	public static void main(String[] args) {
		int[] test1 = { 1, 2, 3, 2, 1 };
		int[] test2 = { 1, 3, 4, 4, 2 };
		int[] test3 = { 1, 1, 1, 2, 1 };

		int chk = 0, cnt = 0;
		for (int i = 0; i < 5; i++) {// test1
			for (int j = 0; j < 5; j++) {
				if (test1[i] == test1[j]) {
					chk++;
				}
			}
			if (chk % 2 != 0) {
				test1[i] = -1;
			}
			chk = 0;
		}
		for (int k = 0; k < 4;) {// test1 재정렬
			if (test1[k] == -1) {
				for (int a = k; a < 4; a++) {
					test1[a] = test1[a + 1];
				}
				test1[4] = 0;
				cnt++;
				k = 0;
			} else {
				k++;
			}
		}
		cnt = 5 - cnt;
		int[] t = new int[cnt];
		for (int h = 0; h < cnt; h++) {
			t[h] = test1[h];
		}
		test1 = new int[cnt];
		for (int h = 0; h < cnt; h++) {
			test1[h] = t[h];
		}
		System.out.println("test1");
		for (int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println();

		chk = 0;
		cnt = 0;
		for (int i = 0; i < 5; i++) {// test2
			for (int j = 0; j < 5; j++) {
				if (test2[i] == test2[j]) {
					chk++;
				}
			}
			if (chk % 2 != 0) {
				test2[i] = -1;
			}
			chk = 0;
		}
		for (int k = 0; k < 4;) {// test2 재정렬
			if (test2[k] == -1) {
				for (int a = k; a < 4; a++) {
					test2[a] = test2[a + 1];
				}
				test2[4] = 0;
				cnt++;
				k = 0;
			} else {
				k++;
			}
		}
		cnt = 5 - cnt;
		t = new int[cnt];
		for (int h = 0; h < cnt; h++) {
			t[h] = test2[h];
		}
		test2 = new int[cnt];
		for (int h = 0; h < cnt; h++) {
			test2[h] = t[h];
		}
		System.out.println("test2");
		for (int i = 0; i < test2.length; i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.println();

		chk = 0;
		cnt = 0;
		for (int i = 0; i < 5; i++) {// test3
			for (int j = 0; j < 5; j++) {
				if (test3[i] == test3[j]) {
					chk++;
				}
			}
			if (chk % 2 != 0) {
				test3[i] = -1;
			}
			chk = 0;
		}
		for (int k = 0; k < 4;) {// test3 재정렬
			if (test3[k] == -1) {
				for (int a = k; a < 4; a++) {
					test3[a] = test3[a + 1];
				}
				test3[4] = 0;
				cnt++;
				k = 0;
			} else {
				k++;
			}
		}
		cnt = 5 - cnt;
		t = new int[cnt];
		for (int h = 0; h < cnt; h++) {
			t[h] = test3[h];
		}
		test3 = new int[cnt];
		for (int h = 0; h < cnt; h++) {
			test3[h] = t[h];
		}
		System.out.println("test3");
		for (int i = 0; i < test3.length; i++) {
			System.out.print(test3[i] + " ");
		}
		System.out.println();

	}
}
