package week6;
import java.util.Scanner;
public class score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[100]; // ������ ������ �迭
		int size = 0; // �Է��� ������ ����
		int num = 0; // �Է��� ����
		int sum = 0; // �Է��� ���� ���� ������ ����
		while (true) {
			System.out.print("������ �Է��ϼ���(-1�� �Է��ϸ� �Է� ����) : ");
			num = scan.nextInt(); // ���� �Է�
			if (num == -1)
				break; // �Է��� ������ -1�̸� �ݺ����� ����ϴ�.
			scores[size++] = num;
			sum += num;
		}
		for (int i = 0; i < size; i++) { // �迭�� ������ ������ �����ϴ� �ݺ����Դϴ�.
			for (int j = i + 1; j < size; j++) { // j�� �׻� i���� ū �ε����� �ݺ��մϴ�.
				if (scores[i] < scores[j]) { // �տ��� �ڿ��ź��� ������ �� �����͸� �ٲ��ݴϴ�.
					int small = scores[i];
					scores[i] = scores[j];
					scores[j] = small;
				}
			}
		}

		System.out.print("\n���� :");
		for (int i = 0; i < size; i++) { // ���ĵ� �迭�� ����մϴ�.
			System.out.print("  " + scores[i]);
		}
		System.out.println("\n��� : " + (double) sum / size); // �հ� / �Է��� ���� = ���
		System.out.print("�ְ� ���� : " + scores[0]); // ������ �� ���Ŀ� ���� 0��° �����Ͱ� �ִ밪�Դϴ�.
		System.out.println("  ���� ���� : " + scores[size - 1]); // ������ �����Ͱ� �ּҰ��Դϴ�.

		while (true) {
			boolean found = false;
			System.out.print("\n����� �˰� ���� ������ �Է��ϼ���(-1�� �Է��ϸ� ����) : ");
			num = scan.nextInt();
			if (num == -1) {
				System.out.println("-1�� �Է��Ͽ� �����մϴ�.");
				break; // �Է��� ������ -1�̸� �ݺ����� ����ϴ�.
			}
			for (int i = 0; i < size; i++) {
				if (scores[i] == num) {
					System.out.println("ã�� ������ " + (i + 1) + "�� �Դϴ�.");
					found = true;
				}
			}
			if (found == false) {
				System.out.println("ã�� ������ �������� �ʽ��ϴ�.");
			}
		}
	}
}