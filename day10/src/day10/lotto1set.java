package day10;

import java.util.Random;

public class lotto1set {
	public static void main(String[] args) {
		Random ran = new Random();
		int[][] lotto = new int[5][7];
		while (true) {
			int cnt = 0, ox = 0;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 7; j++) {
					lotto[i][j] = ran.nextInt(3) + 1;
					if (lotto[i][j] == 3) {
						cnt++;
					} else {
						cnt = 0;
					}
					if (cnt == 3) {
						ox++;
					}
				}
				cnt=0;
			}
			if (ox == 1) {
				for (int k = 0; k < 5; k++) {
					for (int h = 0; h < 7; h++) {
						if (lotto[k][h] == 3) {
							System.out.print(lotto[k][h] + " ");
						} else {
							System.out.print("0 ");
						}
					}
					System.out.println();
				}
				break;
			}
		}
	}
}
