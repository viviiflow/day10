package day10;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 5;
		int[] arID = new int[max];
		int[] arPW = new int[max];
		int[] arMONEY = new int[max];
		int count = 0, log = -1, nid = 100;
		String menu = "=== �ް�IT ATM ===\n";
		menu += "1. ȸ������\n2. ȸ��Ż��\n3. �α���\n4. �α׾ƿ�\n";
		menu += "5. �Ա�\n6. ��ü\n7. �ܾ���ȸ\n0. ����"; // �޴� ���

		while (true) {
			System.out.println(menu);
			System.out.println("");
			System.out.println("�޴� ����:");
			int slt = sc.nextInt();
			if (slt == 0) { // 0 �Է½� ����
				System.out.println("ATM ����");
				break;
			} else if (slt == 1) { // 1 �Է½� ȸ������
				System.out.println("<ȸ������>");
				if (count == 5) { // count ���� 5�� �Ǹ� ���� �Ұ���
					System.out.println("���� �ο� �ʰ�. ���� �Ұ���");
					continue;
				}
				while (true) {
					System.out.println("ID �Է�:");
					int id = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if (arID[i] == id) { // �Էµ� ���̵�� ����� ���̵� ���� ��� �ߺ� ó��
							System.out.println("�ߺ��� ���̵��Դϴ�.");
							break;
						} else if (arID[i] == 0) { // �ߺ� ���̵� ���� ��� 0 ��ġ(���ڸ�)�� ����
							arID[i] = id;
							arMONEY[i] += 1000; // ���Ա� 1000�� �ο� �� count ����
							count++;
							while (true) { // �н����� �Է�
								System.out.println("PW �Է�:");
								int pw = sc.nextInt();
								if (pw != 0) { // 0�� �ƴ� ��� ��� ����
									arPW[count - 1] = pw;
									break;
								} else {
									System.out.println("��� �Ұ��� �н�����");
								}
							}
							break;
						}
					}
					if ((count != 0) && (arID[count - 1] != 0)) {
						break;
					}
				}
			} else if (slt == 2 && log == 1) { // 2 ����, �α��� �� ȸ��Ż�� ����
				System.out.println("<ȸ��Ż��>");
				while (true) {
					int chkid = 100, chkpw = 1000;
					System.out.println("ID �Է�:");
					int logid = sc.nextInt();
					System.out.println("PW �Է�:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if ((arID[i] == logid) && (arPW[i] == logpw)) { // ����� ���̵�� �Է� ���� ���̵� ������ ��� ��ġ ���(�н����� ����)
							chkid = i;
							chkpw = i;
						}
					}
					if ((chkid == chkpw) && (chkid == nid)) { // ���̵�� �н������� ��ġ, ���� ���̵�� ���� �α��ε� ���̵��� ��ġ�� ���� ��� Ż�� ó��
						arID[chkid] = 0;
						arPW[chkpw] = 0;
						log = -1;
						for (int x = nid; x < arID.length - 1; x++) { // ���̵�� �н�����, ���� ������
							arID[x] = arID[x + 1];
							arPW[x] = arPW[x + 1];
							arMONEY[x] = arMONEY[x + 1];
						}
						arID[4] = 0; // �ε��� ���� ������ ������ �ε����� ���� ������
						arMONEY[4] = 0;
						arPW[4] = 0;
						System.out.println("ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
						count--; // ȸ�� Ż�� �� count ����
						break;
					} else { // �ƴ� ��� �޽��� ���
						System.out.println("���̵� �Ǵ� �н����尡 Ʋ���ϴ�.");
						log = 1;
					}
				}
			} else if (slt == 3 && log == -1) { // 3 �Է�, �α׾ƿ� ������ �� �α��� ����
				System.out.println("<�α���>");
				while (true) {
					int chkid = 100, chkpw = 1000;
					System.out.println("ID �Է�:");
					int logid = sc.nextInt();
					System.out.println("PW �Է�:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) { // ����� ���̵�� �Է� ���� ���̵� ������ ��� ��ġ ���(�н����� ����)
						if ((arID[i] == logid) && (arPW[i] == logpw)) {
							chkid = i;
							chkpw = i;
						}
					}
					if (chkid == chkpw) { // ���̵�� �н������� ��ġ�� ���� ��� �α���
						nid = chkid; // ���� �α��ε� ���̵� ��ġ ���
						log = 1;
						System.out.println("�α��� �Ǿ����ϴ�.");
						break;
					} else { // �ƴ� ��� �α��� ���� �޽���
						System.out.println("���̵� �Ǵ� �н����尡 Ʋ���ϴ�.");
						log = -1;
					}
				}

			} else if (slt == 3 && log == 1) {
				System.out.println("���� �α��� ���� �Դϴ�.");
			} else if (slt == 4 && log == 1) { // 4 �Է�, �α��� ������ �� �α׾ƿ� ����
				while (true) {
					int chkid = 100, chkpw = 1000;
					System.out.println("ID �Է�:");
					int logid = sc.nextInt();
					System.out.println("PW �Է�:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) {
						if ((arID[i] == logid) && (arPW[i] == logpw)) { // ����� ���̵�� �Է� ���� ���̵� ������ ��� ��ġ ���(�н����� ����)
							chkid = i;
							chkpw = i;
						}
					}
					if ((chkid == chkpw) && (chkid == nid)) { // ���̵�� �н������� ��ġ�� ����, ���� ���̵�� ���� �α��ε� ���̵��� ��ġ�� ���� ��� �α׾ƿ�
						log = -1;
						nid = 100; // �α׾ƿ� �Ǿ����� �α׾ƿ� ���� �޽���, ���� ���̵� ��ġ �ʱ�ȭ
						System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
						break;
					} else { // �ƴ� ��� �α׾ƿ� ���� �޽���
						System.out.println("���̵� �Ǵ� �н����尡 Ʋ���ϴ�.");
						log = 1;
					}
				}
			} else if (slt == 5 && log == 1) { // 5 �Է�, �α��� ������ �� �Ա� ����
				System.out.println("<�Ա�>");
				while (true) {
					int chkpw = 100;
					System.out.println("Ȯ�� �н����� �Է�:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) { // �Է� ���� �н������ ����� �н����尡 ����, �� ��ġ�� ���� �α��ε� ���̵��� ��ġ�� ���� �� ��ġ ���
						if ((arPW[i] == logpw) && (nid == i)) {
							chkpw = i;
						}
					}
					if (chkpw == 100) { // �н������� ��ġ�� �ʱ�ȭ ������ ���� ���� �� �ٽ� �Է�
						System.out.println("�н����带 �ٽ� �Է��Ͽ� �ּ���.");
					} else {
						System.out.println("�Ա��� �ݾ� �Է�:"); // �ƴ� ��� �Ա� ó��
						int logmn = sc.nextInt();
						arMONEY[chkpw] += logmn;
						System.out.println(logmn + "�� �ԱݵǾ����ϴ�.");
						break;
					}
				}
			} else if (slt == 6 && log == 1) { // 6 �Է�, �α��� ������ �� ��ü ����
				System.out.println("<��ü>");
				int chkpw = 100, chk = -1;
				while (chk != 2) {
					System.out.println("Ȯ�� �н����� �Է�:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) { // �Է� ���� �н������ ����� �н����尡 ����, �� ��ġ�� ���� �α��ε� ���̵��� ��ġ�� ���� �� ��ġ ���
						if ((arPW[i] == logpw) && (nid == i)) {
							chkpw = i;
						}
					}
					if (chkpw == 100) { // �н������� ��ġ�� �ʱ�ȭ ������ ���� ���� �� �ٽ� �Է�
						System.out.println("�н����带 �ٽ� �Է��Ͽ� �ּ���.");
						chk = -1;
						continue;
					} else { // �ƴ� ��� chk �� 1�� �ٲ�
						chk = 1;
						while (chk != 2) { // chk ���� 2�� ���� ���� �� ����(��ü�� �Ϸ���� ���� �� ����) �ݺ�
							int sndid = 100;
							System.out.println("�޴� ��� ID �Է�:");
							int logid2 = sc.nextInt();
							for (int n = 0; n < 5; n++) { // ����� ���̵�� �Է� ���� ���̵�(�޴� ��� ���̵�)�� ������ ��� ��ġ ���
								if (arID[n] == logid2) {
									sndid = n;
								}
							}
							if ((sndid == 100) || (sndid == nid)) { // sndid ���� ���� ���ų�, �޴� ��� ���̵� ���� ���̵��� ��� �ٽ� �Է�
								System.out.println("���̵� �ٽ� �Է��Ͽ� �ּ���.");
								continue;
							} else { // �ƴ� ��� �ݾ� �Է�
								while (true) {
									System.out.println("��ü�� �ݾ� �Է�:");
									int logmn = sc.nextInt();
									if (arMONEY[nid] >= logmn) { // ��ü �ݾ��� ���� �ܰ��� ���ų� ���� ��� ��ü ����
										arMONEY[nid] -= logmn;
										arMONEY[sndid] += logmn;
										System.out.println(logid2 + "���� �������� " + logmn + "�� ��ü�Ǿ����ϴ�.");
										chk = 2; // ��ü �Ϸ� ǥ��
										break;
									} else { // �ܰ� �ʰ� �� �ݾ� �ٽ� �Է�
										System.out.println("�ܰ� �ʰ�");
									}
								}
							}
						}
					}
				}
			} else if (slt == 7 && log == 1) { // 7 �Է�, �α��� ������ �� �ܾ���ȸ ����
				System.out.println("<�ܾ���ȸ>");
				while (true) {
					int chkpw = 100;
					System.out.println("Ȯ�� �н����� �Է�:");
					int logpw = sc.nextInt();
					for (int i = 0; i < 5; i++) { // �Է� ���� �н������ ����� �н����尡 ����, �� ��ġ�� ���� �α��ε� ���̵��� ��ġ�� ���� �� ��ġ ���
						if ((arPW[i] == logpw) && (nid == i)) {
							chkpw = i;
						}
					}
					if (chkpw == 100) { // �н������� ��ġ�� �ʱ�ȭ ������ ���� ���� �� �ٽ� �Է�
						System.out.println("�н����带 �ٽ� �Է��Ͽ� �ּ���.");
					} else { // �ƴ� ��� �ܰ� Ȯ�� �޽���
						System.out.println(arID[nid] + "���� ���� �ܰ�: " + arMONEY[nid] + "��");
						break;
					}
				}
			} else { // �α׾ƿ� ���¿��� 7 �Է� �� �ܾ���ȸ �Ұ�
				System.out.println("�α��� �� �̿��Ͽ� �ֽñ� �ٶ��ϴ�.");
			}
		}
	}
}
